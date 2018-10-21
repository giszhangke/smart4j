package org.smart4j.chapter2.util;

/**
 * Created by klovis on 2018/10/21.
 */
public final class CastUtil {

    public static String castString(Object obj) {
        return castString(obj, "");
    }

    public static String castString(Object obj, String defaultValue) {
        return obj != null ? String.valueOf(obj) : defaultValue;
    }

    public static double castDouble(Object obj) {
        return castDouble(obj, 0);
    }

    public static double castDouble(Object obj, double defaultValue) {
        double result = defaultValue;
        if (obj != null) {
            String strValue = String.valueOf(obj);
            try {
                result = Double.parseDouble(strValue);
            } catch (NumberFormatException e) {
                result = defaultValue;
            }
        }
        return result;
    }

    public static long castLong(Object obj, long defaultValue) {
        long result = defaultValue;
        if (obj != null) {
            String strValue = String.valueOf(obj);
            try {
                result = Long.parseLong(strValue);
            }
            catch (NumberFormatException e) {
                result = defaultValue;
            }
        }
        return result;
    }

    public static int castInt(Object obj) {
        return CastUtil.castInt(obj, 0);
    }

    public static int castInt(Object obj, int defaultValue) {
        int result = defaultValue;
        if (obj != null) {
            String  strValue = castString(obj);
            try {
                result = Integer.parseInt(strValue);
            }
            catch (NumberFormatException e) {
                result = defaultValue;
            }
        }
        return result;
    }

    public static boolean castBoolean(Object obj) {
        return castBoolean(obj);
    }

    public static boolean castBoolean(Object obj, boolean defaultValue) {
        boolean result = defaultValue;
        if (obj != null) {
            result = Boolean.parseBoolean(castString(obj));
        }
        return result;
    }
}
