package com.techmighty.cricscore.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.techmighty.cricscore.R;
import com.techmighty.cricscore.datamanager.database.dao.TeamInfoDAO;
import com.techmighty.cricscore.datamanager.model.TeamInfo;
import com.techmighty.cricscore.datamanager.network.DataManager;
import com.techmighty.cricscore.fragments.LiveScoreFragment;
import com.techmighty.cricscore.fragments.UpComingSeriesFragment;
import com.techmighty.cricscore.utility.LoggerUtility;
import com.techmighty.cricscore.utility.UrlConstants;

import org.json.JSONObject;

public class DashBoardActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private FragmentManager fragmentManager;
    private Fragment fragment;
    private FragmentTransaction transaction;
    private String TAG = DashBoardActivity.class.getSimpleName();
    private DataManager dm;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {


        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    setTitle(R.string.title_live);
                    LiveScoreFragment liveScoreFragment = new LiveScoreFragment();
                    fragmentManager = getSupportFragmentManager();
                    fragment = liveScoreFragment;
                    transaction = fragmentManager.beginTransaction();
                    transaction.setCustomAnimations(R.anim.fade_in, R.anim.fade_out);
                    transaction.replace(R.id.main_container, liveScoreFragment, null)
                            .commit();


                    return true;
                case R.id.navigation_dashboard:
                    setTitle(R.string.title_future);
                    UpComingSeriesFragment upComingSeriesFragment = new UpComingSeriesFragment();
                    fragmentManager = getSupportFragmentManager();
                    fragment = upComingSeriesFragment;
                    transaction = fragmentManager.beginTransaction();
                    transaction.setCustomAnimations(R.anim.fade_in, R.anim.fade_out);
                    transaction.replace(R.id.main_container, upComingSeriesFragment, null)
                            .commit();
                    return true;
                case R.id.navigation_notifications:
                    setTitle(R.string.title_team);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        dm = DataManager.getInstance(this);
        retrieveDataForTeamInfo();
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        LiveScoreFragment liveScoreFragment = new LiveScoreFragment();
        fragmentManager = getSupportFragmentManager();

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.setCustomAnimations(R.anim.fade_in, R.anim.fade_out);
        transaction.replace(R.id.main_container, liveScoreFragment, null)
                .commit();
    }


    private void retrieveDataForTeamInfo() {
        Log.e(TAG, "retrieveData: " + UrlConstants.TEAM_INFO);
        dm.jsonObjectRequest(Request.Method.GET, UrlConstants.TEAM_INFO, null, new DataManager.VolleyJsonCallBack() {
            @Override
            public void onSuccess(JSONObject object) {
                LoggerUtility.e(TAG, "onSuccess: " + object.toString());
                final ObjectMapper objectMapper = new ObjectMapper();
                objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
                objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
                try {
                    TeamInfo teamInfoModel = objectMapper.readValue(object.toString(), TeamInfo.class);
                    if (null != teamInfoModel && teamInfoModel.getQuery() != null
                            && teamInfoModel.getQuery().getResults() != null
                            && teamInfoModel.getQuery().getResults().getTeam() != null
                            && teamInfoModel.getQuery().getResults().getTeam().size() > 0) {
                        TeamInfoDAO teamDao = new TeamInfoDAO();
                        teamDao.saveAll(teamDao, teamDao.TABLE_NAME, teamInfoModel.getQuery().getResults().getTeam());

                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void onError(VolleyError error) {

            }
        });
    }
}
