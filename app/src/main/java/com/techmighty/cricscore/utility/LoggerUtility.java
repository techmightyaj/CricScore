package com.techmighty.cricscore.utility;

import android.util.Log;

import com.techmighty.cricscore.BuildConfig;


/**
 * Created by hari on 07/02/17.
 */

public class LoggerUtility {

    public static boolean DEBUG_SHOW_LOG = false;
    private static final int RESET_COUNT = 4;
    private String delimiterDummy = " - ** ** - ";
    private String TAG = LoggerUtility.class.getSimpleName() + delimiterDummy;
    //private static String TAG = "PEPIN";

    public LoggerUtility() {
        /*if(BuildConfig.SHOW_LOG){
            SHOW_LOG = true;
        }else{
            SHOW_LOG = false;
        }*/
    }

    public static int getResetCount() {
        return RESET_COUNT;

    }


    public static void d(String tag, String string) {
        if (BuildConfig.SHOW_LOG || LoggerUtility.DEBUG_SHOW_LOG) {
            Log.d(tag, "LoggerUtility - " + string);
        }
    }

    public static void v(String tag, String string) {
        if (BuildConfig.SHOW_LOG || LoggerUtility.DEBUG_SHOW_LOG) {
            Log.v(tag, "LoggerUtility - " + string);
        }
    }

    public static void i(String tag, String string) {
        if (BuildConfig.SHOW_LOG || LoggerUtility.DEBUG_SHOW_LOG) {
            Log.i(tag, "LoggerUtility - " + string);
        }
    }

    public static void e(String tag, String string) {
        if (BuildConfig.SHOW_LOG || LoggerUtility.DEBUG_SHOW_LOG) {
            Log.e(tag, "LoggerUtility - " + string);
        }
    }

    public static void e(String tag, String string, Throwable tr) {
        if (BuildConfig.SHOW_LOG || LoggerUtility.DEBUG_SHOW_LOG) {
            Log.e(tag, "LoggerUtility - " + string);
        }
    }


    public static void w(String tag, String string) {
        if (BuildConfig.SHOW_LOG || LoggerUtility.DEBUG_SHOW_LOG) {
            Log.w(tag, "LoggerUtility - " + string);
        }
    }
}
