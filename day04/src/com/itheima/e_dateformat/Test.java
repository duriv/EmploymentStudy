package com.itheima.e_dateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        //创建日期格式化类
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //定义字符串
        //String s = "2020-01:01 00:00:00";错误,需要转成Date对象的字符串格式和指定格式不一致
        /*Date parse = sdf.parse(s);
        System.out.println(parse);*/


        System.out.println("----------format方法-----------");

        //创建Date对象
        Date date = new Date();
        System.out.println(date);//Thu Mar 12 12:01:54 CST 2020
        String format = sdf.format(date);
        System.out.println(format);//2020-03-12 12:01:54
    }
}
