package com.techmighty.cricscore.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.techmighty.cricscore.R;
import com.techmighty.cricscore.adapters.TeamLogoAdapter;
import com.techmighty.cricscore.datamanager.model.TeamInfo;
import com.techmighty.cricscore.datamanager.network.DataManager;
import com.techmighty.cricscore.utility.LoggerUtility;
import com.techmighty.cricscore.utility.UrlConstants;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String TAG = MainActivity.class.getSimpleName();
    private DataManager dataManager;
    private TeamLogoAdapter teamLogoAdapter;
    private List<TeamInfo.QueryBean.ResultsBean.TeamBean> teamBeanList;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataManager = DataManager.getInstance(this);
        teamBeanList = new ArrayList<>();
        initUiComponents();
        retrieveData();
    }


    private void initUiComponents() {
        recyclerView = (RecyclerView) findViewById(R.id.horizontal_recycler_view);
        linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(teamLogoAdapter);
    }

    private void retrieveData() {
        Log.e(TAG, "retrieveData: " + UrlConstants.TEAM_INFO);
        dataManager.jsonObjectRequest(Request.Method.GET, UrlConstants.TEAM_INFO, null, new DataManager.VolleyJsonCallBack() {
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
                        teamBeanList.addAll(teamInfoModel.getQuery().getResults().getTeam());
                        setListToAdapter(teamBeanList);
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

    private void setListToAdapter(List<TeamInfo.QueryBean.ResultsBean.TeamBean> teamBeanList) {
        teamLogoAdapter = new TeamLogoAdapter(this, teamBeanList);
        recyclerView.setAdapter(teamLogoAdapter);
        teamLogoAdapter.notifyDataSetChanged();
    }

}
