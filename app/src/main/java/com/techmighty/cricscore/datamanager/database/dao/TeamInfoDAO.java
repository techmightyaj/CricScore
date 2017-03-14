package com.techmighty.cricscore.datamanager.database.dao;

import android.content.ContentValues;
import android.database.Cursor;
import android.util.Log;

import com.google.gson.Gson;
import com.techmighty.cricscore.datamanager.database.AbstractDatabaseManager;
import com.techmighty.cricscore.datamanager.model.TeamInfo;

/**
 * Created by sarthak on 11/03/17.
 */

public class TeamInfoDAO extends AbstractDatabaseManager<TeamInfo.QueryBean.ResultsBean.TeamBean> {

    private static final String TAG = TeamInfoDAO.class.getSimpleName();
    public static String TABLE_NAME = "TABLE_TEAM_INFO";
    public static String TEAM_ID = "TEAM_ID";
    public static String TEAM_SHORT_NAME = "TEAM_SHORT_NAME";
    public static String TEAM_NAME = "TEAM_NAME";
    public static String TEAM_TYPE = "TEAM_TYPE";
    public static String TEAM_CATEGORY = "TEAM_CATEGORY";
    public static String TEAM_LOGO = "TEAM_LOGO";
    public static String TEAM_LOGO_SMALL = "TEAM_LOGO_SMALL";
    public static String TEAM_FLAG = "TEAM_FLAG";
    public static String TEAM_FLAG_SMALL = "TEAM_FLAG_SMALL";
    public static String TEAM_ROUND_FLAG = "TEAM_ROUND_FLAG";
    public static String TEAM_ROUND_FLAG_SMALL = "TEAM_ROUND_FLAG_SMALL";
    public static String TEAM_ROUND_FLAG_LARGE = "TEAM_ROUND_FLAG_LARGE";
    public static String TEAM_RANKING = "TEAM_RANKING";
    public static String TEAM_CAPTAIN = "TEAM_CAPTAIN";
    public static String TEAM_COACH = "TEAM_COACH";

    public String getCreateQuery() {

        return "CREATE TABLE " + TABLE_NAME + "("

                + KEY_ID + " INTEGER PRIMARY KEY,"

                + TEAM_ID + " TEXT, "

                + TEAM_SHORT_NAME + " TEXT,"

                + TEAM_NAME + " TEXT, "

                + TEAM_TYPE + " TEXT,"

                + TEAM_LOGO + " TEXT,"

                + TEAM_LOGO_SMALL + " TEXT,"

                + TEAM_FLAG + " TEXT,"

                + TEAM_FLAG_SMALL + " TEXT,"

                + TEAM_ROUND_FLAG + " TEXT,"

                + TEAM_ROUND_FLAG_SMALL + " TEXT,"

                + TEAM_ROUND_FLAG_LARGE + " TEXT,"

                + TEAM_RANKING + " TEXT,"

                + TEAM_CAPTAIN + " TEXT,"

                + TEAM_COACH + " TEXT,"

                + TEAM_CATEGORY + " TEXT "


                + ")";

    }

    @Override
    public ContentValues generateContentValuesFromObject(TeamInfo.QueryBean.ResultsBean.TeamBean teamBean) {
        if (teamBean == null)
            return null;

        ContentValues contentValues = new ContentValues();
        try {
            Gson gsonParse = new Gson();
            contentValues.put(TEAM_ID, teamBean.getTeamId().getContent());
            contentValues.put(TEAM_SHORT_NAME, teamBean.getShortName());
            contentValues.put(TEAM_NAME, teamBean.getTeamName());
            contentValues.put(TEAM_TYPE, teamBean.getTeamType());
            contentValues.put(TEAM_CATEGORY, teamBean.getTeamCategory());
            contentValues.put(TEAM_LOGO, teamBean.getTeamLogoPath());
            contentValues.put(TEAM_LOGO_SMALL, teamBean.getTeamLogoSmallPath());
            contentValues.put(TEAM_FLAG, teamBean.getTeamFlagPath());
            contentValues.put(TEAM_FLAG_SMALL, teamBean.getTeamSmallFlagPath());
            contentValues.put(TEAM_ROUND_FLAG, teamBean.getTeamRoundFlagPath());
            contentValues.put(TEAM_ROUND_FLAG_SMALL, teamBean.getTeamSmallRoundFlagPath());
            contentValues.put(TEAM_ROUND_FLAG_LARGE, teamBean.getTeamLargeRoundFlagPath());

            String rankingJSON = gsonParse.toJson(teamBean.getRanking());
            contentValues.put(TEAM_RANKING, rankingJSON);
            String captainJSON = gsonParse.toJson(teamBean.getCaptain());
            contentValues.put(TEAM_CAPTAIN, captainJSON);
            String coachJSON = gsonParse.toJson(teamBean.getCoach());
            contentValues.put(TEAM_COACH, coachJSON);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return contentValues;
    }

    @Override
    public TeamInfo.QueryBean.ResultsBean.TeamBean generateObjectFromCursor(Cursor c) {

        if (c == null)
            return null;

        TeamInfo.QueryBean.ResultsBean.TeamBean teamBean = new TeamInfo.QueryBean.ResultsBean.TeamBean();
        teamBean.setTeamID(c.getString(c.getColumnIndex(TEAM_ID)));
        teamBean.setShortName(c.getString(c.getColumnIndex(TEAM_SHORT_NAME)));
        teamBean.setTeamName(c.getString(c.getColumnIndex(TEAM_NAME)));
        teamBean.setTeamType(c.getString(c.getColumnIndex(TEAM_TYPE)));
        teamBean.setTeamCategory(c.getString(c.getColumnIndex(TEAM_CATEGORY)));
        teamBean.setTeamLogoPath(c.getString(c.getColumnIndex(TEAM_LOGO)));
        teamBean.setTeamLogoSmallPath(c.getString(c.getColumnIndex(TEAM_LOGO_SMALL)));
        teamBean.setTeamFlagPath(c.getString(c.getColumnIndex(TEAM_FLAG)));
        teamBean.setTeamSmallFlagPath(c.getString(c.getColumnIndex(TEAM_FLAG_SMALL)));
        teamBean.setTeamRoundFlagPath(c.getString(c.getColumnIndex(TEAM_ROUND_FLAG)));
        teamBean.setTeamSmallRoundFlagPath(c.getString(c.getColumnIndex(TEAM_ROUND_FLAG_SMALL)));
        teamBean.setTeamLargeRoundFlagPath(c.getString(c.getColumnIndex(TEAM_ROUND_FLAG_LARGE)));
        teamBean.setRanking(c.getString(c.getColumnIndex(TEAM_RANKING)));
        teamBean.setTeamCategory(c.getString(c.getColumnIndex(TEAM_CATEGORY)));
        teamBean.setCaptain(c.getString(c.getColumnIndex(TEAM_CAPTAIN)));

        return teamBean;
    }

    public String getTeamObjectFromId(String id) {

        String query = "SELECT * FROM " + TABLE_NAME + " WHERE " + TEAM_ID + " = '" + id + "'";
        Log.e(TAG, "getTeamObjectFromId: " + query);
        return query;
    }
}
