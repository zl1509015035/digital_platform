package com.it.web.util;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {

    /**
     * yyyy-MM-dd HH:mm:ss
     */
    public static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";

    /**
     * yyyy-MM-dd
     */
    public static final String YYYY_MM_DD = "yyyy-MM-dd";

    /**
     * yyyy-MM-dd
     */
    public static final String YYYY_MM_CHINESE = "yyyy年M月";

    /**
     * 获取当前时间 String 类型
     * @return
     */
    public static String getNowDate(){
        SimpleDateFormat sdf = new SimpleDateFormat(YYYY_MM_DD_HH_MM_SS);// 设置日期格式
        String format = sdf.format(new Date());
        return format;
    }

    /**
     * 通用时间转String 方法
     * @param date
     * @param pattern
     * @return
     */
    public static String dateFormat(Date date, String pattern) {
        if (date == null) {
            return "";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }

    /**
     * 获取LocalDate类型的格式化字符串
     *
     * @param localDate 日期
     * @param pattern   格式，例如"yyyy-MM-dd"
     * @return 格式化后的日期字符串
     */
    public static String localDateFormat(LocalDate localDate, String pattern) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        return dateTimeFormatter.format(localDate);
    }

    /**
     * 获取LocalDateTime类型的格式化字符串
     *
     * @param localDateTime 日期时间
     * @param pattern       格式，例如"yyyy-MM-dd HH:mm:ss nnnnnn"
     * @return 格式化后的日期字符串
     */
    public static String localDateTimeFormat(LocalDateTime localDateTime, String pattern) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        return dateTimeFormatter.format(localDateTime);
    }

    /**
     * 根据时间字符串获取Date对象
     *
     * @param dateStr 时间字符串
     * @param pattern       格式，例如"yyyy-MM-dd HH:mm:ss nnnnnn"
     * @return 格式化后的日期字符串
     */
    public static LocalDate parse(String dateStr, String pattern) {
        DateTimeFormatter dateTimeFormatter = null;
        if(YYYY_MM_CHINESE.equals(pattern)){
            dateTimeFormatter = new DateTimeFormatterBuilder()
                    .appendPattern(pattern)
                    .parseDefaulting(ChronoField.DAY_OF_MONTH, 1)
                    .toFormatter();
        }else{
            dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        }
        LocalDate localDate = LocalDate.parse(dateStr, dateTimeFormatter);
        return localDate;
    }

    public static Date asDate(LocalDate localDate) {
        return Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }

    public static LocalDateTime asLocalDateTime(Date date) {
        return Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

    /**
     * 获取当月第一天
     */
    public static Date dateTimeMonthEnd(){
        Calendar cale = Calendar.getInstance();
        cale = Calendar.getInstance();
        cale.add(Calendar.MONTH, 1);
        cale.set(Calendar.DAY_OF_MONTH, 0);
        return cale.getTime();
    }
}
