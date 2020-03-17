package com.itheima.e_dateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
   考虑的问题:我们直接输出Date对象,格式我们看不太懂->Thu Jan 01 08:00:01 CST 1970
            但是,我们看的懂的时间格式:xxxx年-xx月-xx日 xx时:xx分:xx秒

   日期格式化类:
     1.概述:DateFormat:抽象类->不能直接new对象

       使用:SimpleDateFormat extends DateFormat
     2.构造:
        SimpleDateFormat(String pattern)
          pattern:格式;规则-->字母不能乱写,字母之间的符号你可以随便
            年       y
            月       M
            日       d
            时       H
            分       m
            秒       s

           yyyy-MM-dd HH:mm:ss
       3.方法
          String format(Date date):传递的是日期对象,返回格式化后的字符串-->格式化
          Date parse(String str):传递的是字符串,返回值的Date对象.将符合规则的字符串,变成Date对象-->解析

       4.小结一下:
          format将Date按照我们指定的规则,变成我们看的懂的时间表示形式
          parse:将符合规则的字符串变回Date对象->需要抛异常(alt+回车)
 */
public class DateFormat01 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");

        //格式化
        format(sdf);

        //解析方法
        parse(sdf);

    }

    public static void parse(SimpleDateFormat sdf) throws ParseException {
        //定义字符串
        String s = "2020-01-01 01:01:01";
        Date date = sdf.parse(s);
        System.out.println(date);
    }

    public static void format(SimpleDateFormat sdf) {
        //创建Date对象
        Date date = new Date();
        System.out.println(date);
        //格式化
        String format = sdf.format(date);
        System.out.println(format);
    }
}
