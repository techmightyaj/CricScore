package com.techmighty.cricscore.utility;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Created by amulyaagarwal on 05-09-2015.
 */
public class DateUtility {
    public final static String DATE_PATTERN = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    public final static String ONLY_TIME_PATTERN = "hh:mm a";
    public final static String TIME_24_HRS_PATTERN = "HH:mm";
    public final static String WITHOUT_T_Z_DATE_PATTERN = "yyyy-MM-dd HH:mm";
    public final static String DATE_PATTERN_WITH_SECONDS = "yyyy-MM-dd HH:mm:ss";
    public final static String DATE_TIME = "dd MMM, hh:mm aa";
    public final static String DATE_TIME_YEAR = "dd MMM, yyyy";
    public final static String DATE_SLASH_FORMAT = "dd/MM/yyy";
    public final static String TIME = "hh:mm aa";
    public final static String DATE_MONTH_YEAR = "dd MMMM yyyy";
    private static final long ONE_MINUTE_IN_MILLIS = 60000;//millisecs

    private static String TAG = DateUtility.class.getSimpleName();

    /*--------
        Date Format Change
    ---------*/
    public static String formatDate(String origFormat, String desiredFormat,
                                    String origDate) {

        String desiredDate = "";
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(origFormat, Locale.US);
            Date date = simpleDateFormat.parse(origDate);
            simpleDateFormat.applyPattern(desiredFormat);
            desiredDate = simpleDateFormat.format(date);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return desiredDate; // desired date format returned
    }


    /*-----------------
        Get Current Time Stamp
    * -----------------*/
    public static String getMilliToDate(long mSec, String desiredFormat) {
        DateFormat dateFormat = new SimpleDateFormat(desiredFormat, Locale.US);
        //Convert Milliseconds to Date in particular format
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(mSec);
        System.out.println(dateFormat.format(cal.getTime()) + "**************************");
        return dateFormat.format(cal.getTime());
    }

    public static long StringDateToLong(String dateStr, String desiredFormat) {
        //String dateStr="2015-12-17 15:41:47";
        Date convertedDate = new Date();
        SimpleDateFormat format = new SimpleDateFormat(desiredFormat, Locale.ENGLISH);

        long timeinMilliSec = 0;
        try {

            convertedDate = format.parse(dateStr);
            timeinMilliSec = convertedDate.getTime();
            LoggerUtility.i("dateToLong", "convertedDate " + convertedDate.getTime());
            //LoggerUtility.i("dateToLong", "System.currentTimeMillis " + System.currentTimeMillis());

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return timeinMilliSec;
    }

    //"yyyy-MM-dd'T'HH:mm:ss"
/*    public static String getDate(String dateString, String desiredFormat) {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat(desiredFormat);
            formatter.setTimeZone(TimeZone.getDefault());
            Date value = null;
            try {
                value = formatter.parse(dateString);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            SimpleDateFormat dateFormatter = new SimpleDateFormat(desiredFormat);
            dateFormatter.setTimeZone(TimeZone.getTimeZone("GMT+5:30"));
            String dt = dateFormatter.format(value);

            LoggerUtility.e(TAG, "getDate :-" + dt);
            return dt;
        } catch (Exception e) {
            e.printStackTrace();
            return DateUtility.getMilliToDate(System.currentTimeMillis(), desiredFormat);
        }
    }*/

    /*------------
        UTC Formate
    -------------- */
    public static String getDateTimeInUTC(String dateString, String dataFormat) {
        try {
            LoggerUtility.e(TAG, "getDateTimeInAnyFormat:-  " + dateString);
            SimpleDateFormat formatter = new SimpleDateFormat(dataFormat);
            formatter.setTimeZone(TimeZone.getDefault());
            Date value = null;
            try {
                value = formatter.parse(dateString);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            SimpleDateFormat dateFormatter = new SimpleDateFormat(dataFormat);
            dateFormatter.setTimeZone(TimeZone.getTimeZone("GMT+0:00"));
            String dt = dateFormatter.format(value);

            LoggerUtility.e(TAG, "getDateTimeInUTC :-" + dt);
            return dt;
        } catch (Exception e) {
            e.printStackTrace();
            return DateUtility.getMilliToDate(System.currentTimeMillis(), dataFormat);
        }
    }

    public static String getDateTimeTheirFormat(String dateString) {
        try {
            LoggerUtility.e(TAG, "getDateTimeInAnyFormat:-  " + dateString);
            SimpleDateFormat formatter = new SimpleDateFormat(DATE_PATTERN);
            formatter.setTimeZone(TimeZone.getTimeZone("GMT+0:00"));
            Date value = null;
            try {
                value = formatter.parse(dateString);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            SimpleDateFormat dateFormatter = new SimpleDateFormat(DATE_PATTERN);
            String dt = dateFormatter.format(value);
            dateFormatter.setTimeZone(TimeZone.getDefault());
            LoggerUtility.e(TAG, "getDateTimeInUTC :-" + dt);
            return dt;
        } catch (Exception e) {
            e.printStackTrace();
            return DateUtility.getMilliToDate(System.currentTimeMillis(), DATE_PATTERN);
        }
    }

    public static String convertDateFromUtcToLocal(String dateString, String pattern) {
        try {
            LoggerUtility.e(TAG, "getDateTimeInAnyFormat:-  " + dateString);
            SimpleDateFormat formatter = new SimpleDateFormat(DATE_PATTERN);
            formatter.setTimeZone(TimeZone.getTimeZone("GMT+0:00"));
            Date value = null;
            try {
                value = formatter.parse(dateString);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            SimpleDateFormat dateFormatter = new SimpleDateFormat(pattern);
            String dt = dateFormatter.format(value);
            dateFormatter.setTimeZone(TimeZone.getDefault());
            LoggerUtility.i(TAG, "getDateTimeInUTC from:-" + dateString + "to " + dt);
            return dt;
        } catch (Exception e) {
            e.printStackTrace();
            return DateUtility.getMilliToDate(System.currentTimeMillis(), DATE_PATTERN);
        }
    }

    /*------------
        IST Formate
    -------------- */
/*    public static String getDateTimeInIST(String dateString) {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat(DATE_PATTERN);
            formatter.setTimeZone(TimeZone.getDefault());
            Date value = null;
            try {
                value = formatter.parse(dateString);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            SimpleDateFormat dateFormatter = new SimpleDateFormat(DATE_PATTERN);
            dateFormatter.setTimeZone(TimeZone.getTimeZone("GMT+5:30"));
            String dt = dateFormatter.format(value);

            LoggerUtility.e(TAG, "getDateTimeInIST :-" + dt);
            return dt;
        } catch (Exception e) {
            e.printStackTrace();
            return DateUtility.getMilliToDate(System.currentTimeMillis(), DATE_PATTERN);
        }
    }*/

    //  2016-03-14 15:13:46.0

    public static String parseDateToddMMyyyy(String time) {
        String str = "";
        try {
            String inputPattern = "yyyy-MM-dd HH:mm:ss";
            String outputPattern = "h:mm a";
            SimpleDateFormat inputFormat = new SimpleDateFormat(inputPattern);
            SimpleDateFormat outputFormat = new SimpleDateFormat(outputPattern);

            Date date = inputFormat.parse(time);
            str = outputFormat.format(date);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return str;
    }

    public static String getCurrentDate(String outPutformat) {
        SimpleDateFormat sdf = new SimpleDateFormat(outPutformat);
        String currentDateandTime = sdf.format(new Date());
        return currentDateandTime;

    }

    public static String getModifiedMins(String outputFormat, int mins) {

        Calendar date = Calendar.getInstance();
        date.add(Calendar.MINUTE, mins);
        Date afterAddingTenMins = date.getTime();

        SimpleDateFormat format = new SimpleDateFormat(outputFormat);
        String formattedDate = format.format(afterAddingTenMins);
        return formattedDate;
    }

    public static String getModifiedDate(String outputFormat, int days) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, days);
        Date date = calendar.getTime();
        SimpleDateFormat format = new SimpleDateFormat(outputFormat);
        String formattedDate = format.format(date);
        return formattedDate;


    }

    public static String getDateInUTC(String dateFormat) {
        return getDateInUTCForDate(System.currentTimeMillis(), dateFormat);

    }

    public static String getDateInUTCForDate(final long timeMillis, String datePattern) {
        return DateUtility.getDateTimeInUTC(DateUtility.getMilliToDate(timeMillis, datePattern), datePattern);

    }

    public static Boolean isBefore(long timestamp) {
        Calendar todayCal = Calendar.getInstance();
        todayCal.setTimeInMillis(System.currentTimeMillis());

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timestamp);

        if (calendar.get(Calendar.YEAR) < todayCal.get(Calendar.YEAR)) {
            return Boolean.TRUE;
        } else {
            if (calendar.get(Calendar.YEAR) == todayCal.get(Calendar.YEAR)) {
                if (calendar.get(Calendar.DAY_OF_YEAR) >= todayCal.get(Calendar.DAY_OF_YEAR)) {
                    return Boolean.FALSE;
                } else {
                    return Boolean.TRUE;
                }
            } else {
                return Boolean.FALSE;
            }
        }
    }

    public static long getDateTimePatternInUTC(String date, String format) {
        long millisecond = StringDateToLong(date, format);
        LoggerUtility.e(TAG, "getDateTimePatternInUTC: " + millisecond);
        return millisecond;
    }

}
