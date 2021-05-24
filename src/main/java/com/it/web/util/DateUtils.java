package com.it.web.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    public static String getNowDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
        String format = sdf.format(new Date());
        return format;
    }
}
