package com.thinkin.java;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by peixuan.xie on 2017/9/7.
 */
public class Logger {

    public static void print(Object object)
    {
        System.out.println(object);
    }

    public static void main(String[] args) {
        Date currentTime=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyMMddHHmmss");
        String timeString=simpleDateFormat.format(currentTime);
        System.out.println(timeString);
        System.out.println(timeString.substring(0,6));
        System.out.println(timeString.substring(6,12));
    }
}
