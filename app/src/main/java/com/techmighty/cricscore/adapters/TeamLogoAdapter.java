package com.techmighty.cricscore.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.techmighty.cricscore.AppController;
import com.techmighty.cricscore.R;
import com.techmighty.cricscore.datamanager.model.TeamInfo;
import com.techmighty.cricscore.utility.CircularNetworkImageView;

import java.util.List;

/**
 * Created by avaria on 05/03/17.
 */

public class TeamLogoAdapter extends RecyclerView.Adapter<TeamLogoAdapter.TeamViewHolder> {

    private Context mContext;
    private List<TeamInfo.QueryBean.ResultsBean.TeamBean> teamBeanList;
    private ImageLoader imageLoader;

    public TeamLogoAdapter(Context mContext, List<TeamInfo.QueryBean.ResultsBean.TeamBean> teamBeanList) {
        this.mContext = mContext;
        this.teamBeanList = teamBeanList;
        imageLoader = AppController.getInstance().getImageLoader();
    }

    @Override
    public TeamViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row_team_adapter, parent, false);
        TeamViewHolder viewHolder = new TeamViewHolder(v);


        return viewHolder;

    }

    @Override
    public void onBindViewHolder(TeamViewHolder holder, int position) {
        TeamInfo.QueryBean.ResultsBean.TeamBean teamBean = teamBeanList.get(position);
        if (imageLoader == null) {
            imageLoader = AppController.getInstance().getImageLoader();
        } else {
            imageLoader.get(teamBean.getTeamSmallRoundFlagPath(), ImageLoader.getImageListener(holder.profileView, R.mipmap.ic_launcher,
                    R.mipmap.ic_launcher));
            holder.profileView.setImageUrl(teamBean.getTeamSmallRoundFlagPath(), imageLoader);

        }
        holder.teamName.setText(teamBean.getShortName());
    }

    @Override
    public int getItemCount() {
        return teamBeanList.size();
    }

    public class TeamViewHolder extends RecyclerView.ViewHolder {

        private CircularNetworkImageView profileView;
        private TextView teamName;

        public TeamViewHolder(View view) {
            super(view);
            profileView = (CircularNetworkImageView) view.findViewById(R.id.profile_image);
            teamName = (TextView) view.findViewById(R.id.tv_team_name);


        }
    }

}
