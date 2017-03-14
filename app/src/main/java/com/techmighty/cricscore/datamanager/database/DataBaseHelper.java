package com.techmighty.cricscore.datamanager.database;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.techmighty.cricscore.datamanager.database.dao.TeamInfoDAO;

/**
 * Created by sarthak on 11/03/17.
 */

public class DataBaseHelper extends SQLiteOpenHelper {

    private static DataBaseHelper sInstance;
    //Database
    private static final String DATABASE_NAME = "CricScore";
    private static final int DATABASE_VERSION = 1;

    private DataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public static synchronized DataBaseHelper getInstance(Context context) {

        if (sInstance == null) {
            synchronized (DataBaseHelper.class) {
                if (sInstance == null) {
                    sInstance = new DataBaseHelper(context);
                }
            }
        }
        return sInstance;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(new TeamInfoDAO().getCreateQuery());
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
