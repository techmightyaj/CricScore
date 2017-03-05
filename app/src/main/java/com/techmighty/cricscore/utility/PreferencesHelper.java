package com.techmighty.cricscore.utility;

import android.content.Context;
import android.content.SharedPreferences;


public class PreferencesHelper {

    //ALl the share preference key constant will be here only so it will be easy to track what all data we are storing in sp
    public static final String IS_DEVICE_INFO_SEND = "is_device_info_send";
    public static final String IS_REMEMBER_ME = "IS_REMEMBER_ME";
    public static final String PASSWORD = "p";


    public static final String IS_TRIP_STARTED = "IS_TRIP_STARTED";
    public static final String IS_PRESENT = "IS_PRESENT";
    public static final String TRIP_STATUS = "TRIP_STATUS";
    public static final String ATTENDANCE = "ATTENDANCE";
    public static final String MOBILE_IMEI = "IMEI";
    public static final String STAGING_URL = "STAGING_URL";
    public static final String TRANSACTION_ID = "TRANSACTION_ID";
    public static final String RECEIPIENT_NAME = "RECEIPIENT_NAME";
    public static final String USER_NAME = "USER_NAME";
    public static final String DELIVERY_MEDIUM_NAME = "DELIVERY_MEDIUM_NAME";
    public static final String SERVICE_AREA_COUNT = "SERVICE_AREA_COUNT";
    public static final String COUNTRY_CODE = "countryCode";

    public static final String ODOMETER_READING_MODE = "ODOMETER_READING_MODE";
    public static final String ODOMETER_SERVER_STATUS = "ODOMETER_SERVER_STATUS";
    public static final String ODOMETER_START_READING = "ODOMETER_START_READING";
    public static final String ODOMETER_SERVER_READING = "ODOMETER_SERVER_READING";
    public static final String ODOMETER_ID_FROM_SERVER = "ODOMETER_ID_FROM_SERVER";
    public static final String ODOMETER_NEW_ID = "ODOMETER_NEW_ID";
    //ODOMETER_CURRENT_STATUS is used to show compulsory odometer popup after login
    public static final String ODOMETER_CURRENT_STATUS = "ODOMETER_CURRENT_STATUS";
    public static final String FCM_TOKEN = "FCM_TOKEN";
    public static final String MODEL_TYPE = "MODEL_TYPE";


    private static PreferencesHelper instance = null;
    private static SharedPreferences.Editor editor;
    private final SharedPreferences mPref;

    private PreferencesHelper(Context context) {

        mPref = context.getSharedPreferences(HelperConstants.USER_PREFERENCES, Context.MODE_PRIVATE);
    }

    public static PreferencesHelper getInstance(Context context) {
        if (instance == null) {
            instance = new PreferencesHelper(context);
        }
        return instance;
    }


    public void writeString(String key, String value) {
        if (mPref != null) {
            editor = mPref.edit();
            editor.putString(key, value);
            editor.apply();
            editor.commit();
        }

    }

    public String readString(String key) {
        return (mPref != null) ? mPref.getString(key, null) : null;
    }

    public void writeBoolean(String key, boolean value) {
        if (mPref != null) {
            editor = mPref.edit();
            editor.putBoolean(key, value);
            editor.apply();
            editor.commit();
        }

    }

    public boolean readBoolean(String key) {
        return ((mPref != null) && (mPref.getBoolean(key, false)));
    }

    public void writeInt(String key, int value) {
        if (mPref != null) {
            editor = mPref.edit();
            editor.putInt(key, value);
            editor.apply();
        }
    }

    public int readInt(String key) {
        return (mPref != null) ? mPref.getInt(key, -1) : -1;
    }

    public void clear() {
        mPref.edit().clear().apply();
    }

    public void writeLong(String key, long value) {
        if (mPref != null) {
            editor = mPref.edit();
            editor.putLong(key, value);
            editor.apply();
        }
    }

    public Long readLong(String key, long defaultValue) {
        return (mPref != null) ? mPref.getLong(key, defaultValue) : -1;
    }

    public void removePref(String key) {

        if (mPref != null && key != null) {
            editor = mPref.edit();
            editor.remove(key);
            editor.commit();
        }

    }
}
