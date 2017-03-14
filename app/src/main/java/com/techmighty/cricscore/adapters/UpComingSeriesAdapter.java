package com.techmighty.cricscore.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.techmighty.cricscore.AppController;
import com.techmighty.cricscore.R;
import com.techmighty.cricscore.datamanager.database.AbstractDatabaseManager;
import com.techmighty.cricscore.datamanager.database.dao.TeamInfoDAO;
import com.techmighty.cricscore.datamanager.model.TeamInfo;
import com.techmighty.cricscore.datamanager.model.UpComingSeriesModel;
import com.techmighty.cricscore.utility.DateUtility;
import com.techmighty.cricscore.utility.LoggerUtility;

import java.util.List;

import static com.techmighty.cricscore.AppController.TAG;

/**
 * Created by sarthak on 11/03/17.
 */

public class UpComingSeriesAdapter extends RecyclerView.Adapter<UpComingSeriesAdapter.UpComingViewHolder> {

    private ImageLoader imageLoader;
    private List<UpComingSeriesModel.QueryBean.ResultsBean.MatchBean> matchBeanList;
    private Context mContext;
    private AbstractDatabaseManager teamInfoDAO;

    public UpComingSeriesAdapter(List<UpComingSeriesModel.QueryBean.ResultsBean.MatchBean> matchBeanList,
                                 Context mContext) {
        this.imageLoader = AppController.getInstance().getImageLoader();
        this.matchBeanList = matchBeanList;
        this.mContext = mContext;
        teamInfoDAO = new TeamInfoDAO();

    }

    @Override
    public UpComingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_upcoming_series, parent, false);
        UpComingViewHolder viewHolder = new UpComingViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(UpComingViewHolder holder, int position) {

        UpComingSeriesModel.QueryBean.ResultsBean.MatchBean matchBean = matchBeanList.get(position);
        holder.tvSeriesname.setText(matchBean.getSeriesName());
        holder.tvSeriesType.setText(matchBean.getMtype().toUpperCase());
        LoggerUtility.e(TAG, "matchBean.getStartDate() " + matchBean.getStartDate());
        holder.tvStartDt.setText(DateUtility.formatDate(DateUtility.DATE_PATTERN, DateUtility.DATE_MONTH_YEAR, matchBean.getStartDate()));
        holder.tvEndDt.setText(DateUtility.getMilliToDate(matchBean.getDateMatchEnd(), DateUtility.DATE_MONTH_YEAR));
        holder.tvVersus.setText(matchBean.getTeam().get(0).getTeam() + " Vs "
                + matchBean.getTeam().get(1).getTeam());

        holder.tvVenue.setText(matchBean.getVenue().getContent());
        if (imageLoader == null) {
            imageLoader = AppController.getInstance().getImageLoader();
        } else {

            List<TeamInfo.QueryBean.ResultsBean.TeamBean> teamBeanList = (List<TeamInfo.QueryBean.ResultsBean.TeamBean>) teamInfoDAO.load(teamInfoDAO,
                    new TeamInfoDAO().getTeamObjectFromId(matchBean.getTeam().get(0).getTeamid()));
            if (teamBeanList != null && teamBeanList.size() > 0) {
                TeamInfo.QueryBean.ResultsBean.TeamBean teamBean = teamBeanList.get(0);
                LoggerUtility.e(TAG, "onBindViewHolder:  1" + teamBean.getTeamLogoPath());
                imageLoader.get(teamBean.getTeamLargeRoundFlagPath(), ImageLoader.getImageListener(holder.ivTeam1, R.mipmap.ic_launcher,
                        R.mipmap.ic_launcher));
                holder.ivTeam1.setImageUrl(teamBean.getTeamLargeRoundFlagPath(), imageLoader);
            }
            List<TeamInfo.QueryBean.ResultsBean.TeamBean> teamBeanList2 = (List<TeamInfo.QueryBean.ResultsBean.TeamBean>) teamInfoDAO.load(teamInfoDAO,
                    new TeamInfoDAO().getTeamObjectFromId(matchBean.getTeam().get(1).getTeamid()));
            if (teamBeanList2 != null && teamBeanList2.size() > 0) {
                TeamInfo.QueryBean.ResultsBean.TeamBean teamBean2 = teamBeanList2.get(0);
                LoggerUtility.e(TAG, "onBindViewHolder: 2" + teamBean2.getTeamLogoPath());
                imageLoader.get(teamBean2.getTeamLargeRoundFlagPath(), ImageLoader.getImageListener(holder.ivTeam2, R.mipmap.ic_launcher,
                        R.mipmap.ic_launcher));
                holder.ivTeam2.setImageUrl(teamBean2.getTeamLargeRoundFlagPath(), imageLoader);
            }
        }
    }

    @Override
    public int getItemCount() {
        return matchBeanList.size();
    }

    public class UpComingViewHolder extends RecyclerView.ViewHolder {

        private TextView tvVersus, tvStartDt, tvEndDt, tvVenue, tvSeriesname, tvSeriesType;
        private NetworkImageView ivTeam1, ivTeam2;

        public UpComingViewHolder(View itemView) {
            super(itemView);

            tvVersus = (TextView) itemView.findViewById(R.id.tv_versus_name);
            tvStartDt = (TextView) itemView.findViewById(R.id.tv_start_date);
            tvEndDt = (TextView) itemView.findViewById(R.id.tv_end_date);
            tvSeriesname = (TextView) itemView.findViewById(R.id.tv_series_name);
            tvSeriesType = (TextView) itemView.findViewById(R.id.tv_series_type);
            tvVenue = (TextView) itemView.findViewById(R.id.tv_venue);

            ivTeam1 = (NetworkImageView) itemView.findViewById(R.id.iv_team_1);
            ivTeam2 = (NetworkImageView) itemView.findViewById(R.id.iv_team_2);
        }
    }
}
