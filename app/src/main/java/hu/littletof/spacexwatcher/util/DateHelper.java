package hu.littletof.spacexwatcher.util;

import android.util.Log;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import hu.littletof.spacexwatcher.model.ILaunch;

public class DateHelper {

    public static boolean considerLiveLaunch(ILaunch l) {
        Date now = new Date();
        return Math.abs(DateHelper.getDate(l.getLaunchDateUtc()).getTime() - now.getTime()) <= 2*60*60*1000;
    }

    public static String getDateFromUTC(String utc, String format) {
        SimpleDateFormat m_ISO8601Local = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        m_ISO8601Local.setTimeZone(TimeZone.getTimeZone("UTC"));
        try {
            Date parsed = m_ISO8601Local.parse(utc);
            return getDateFormat(parsed, format);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Date getDate(String utc) {
        SimpleDateFormat m_ISO8601Local = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        m_ISO8601Local.setTimeZone(TimeZone.getTimeZone("UTC"));
        try {
            Date parsed = m_ISO8601Local.parse(utc);
            return parsed;
        }catch (ParseException e) {
            return null;
        }
    }

    public static String getDateFormat(Date date, String format) {
        DateFormat dateFormat = new SimpleDateFormat(format);
        String strDate = dateFormat.format(date);

        return strDate;
    }

    public static String getDateFromCal(Calendar calendar) {
        return calendar.get(Calendar.YEAR)+"."+calendar.get(Calendar.MONTH)+"."+calendar.get(Calendar.DAY_OF_MONTH)+".";
    }

    public static String getTimeFromCal(Calendar calendar) {
        return calendar.get(Calendar.HOUR_OF_DAY)+":"+calendar.get(Calendar.MINUTE)+":"+calendar.get(Calendar.SECOND);
    }
}
