package com.it.web.util;

import java.math.BigDecimal;

public class Test {

    public static void main(String[] args) {
        String str = "12.4";

        Integer i = 10;

        String s = "5";

        BigDecimal data1 = new BigDecimal(str);
        BigDecimal data2 = new BigDecimal(i);
        BigDecimal data3 = new BigDecimal(s);
        if (data2.compareTo(data3) > 0 && data2.compareTo(data1)<0) {
            System.out.println("应用型人才");
        }
    }
}
