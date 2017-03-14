package com.techmighty.cricscore.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.techmighty.cricscore.R;
import com.techmighty.cricscore.adapters.UpComingSeriesAdapter;
import com.techmighty.cricscore.datamanager.model.UpComingSeriesModel;
import com.techmighty.cricscore.datamanager.network.DataManager;
import com.techmighty.cricscore.utility.LoggerUtility;
import com.techmighty.cricscore.utility.UrlConstants;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link UpComingSeriesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class UpComingSeriesFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private String TAG = UpComingSeriesFragment.class.getSimpleName();
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private UpComingSeriesAdapter upComingSeriesAdapter;
    private View mView;
    private List<UpComingSeriesModel.QueryBean.ResultsBean.MatchBean> matchesBeanList;

    public UpComingSeriesFragment() {
        // Required empty public constructor
    }


    public static UpComingSeriesFragment newInstance(String param1, String param2) {
        UpComingSeriesFragment fragment = new UpComingSeriesFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_future_score, container, false);
        return mView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        matchesBeanList = new ArrayList<>();
        initUiComponents();
        retrieveMatchesData();
    }

    private void initUiComponents() {
        recyclerView = (RecyclerView) mView.findViewById(R.id.rv_upcoming_matches);
        linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
    }


    private void retrieveMatchesData() {
        LoggerUtility.e(TAG, "retrieveData: " + UrlConstants.UPCOMING_MATCHES);
        DataManager dm = DataManager.getInstance(getContext());
        dm.jsonObjectRequest(Request.Method.GET, UrlConstants.UPCOMING_MATCHES, null, new DataManager.VolleyJsonCallBack() {
            @Override
            public void onSuccess(JSONObject object) {

                try {
                    final ObjectMapper objectMapper = new ObjectMapper();
                    objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
                    objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

                    UpComingSeriesModel upComingMatchesModel = objectMapper.readValue(object.toString(), UpComingSeriesModel.class);
                    if (null != upComingMatchesModel && upComingMatchesModel.getQuery().getResults() != null
                            && upComingMatchesModel.getQuery().getResults().getMatch() != null
                            && upComingMatchesModel.getQuery().getResults().getMatch().size() > 0) {

                        matchesBeanList.addAll(upComingMatchesModel.getQuery().getResults().getMatch());
                        upComingSeriesAdapter = new UpComingSeriesAdapter(matchesBeanList, getContext());
                        recyclerView.setAdapter(upComingSeriesAdapter);
                        upComingSeriesAdapter.notifyDataSetChanged();
                    }
                } catch (Exception e) {

                }

            }

            @Override
            public void onError(VolleyError error) {

            }
        });
    }

}
