package com.itheima.f_calendar;

import java.util.Calendar;

/*
    Calendar:日历类
      1.概述:
         是一个抽象类  abstract class Calendar
      2.使用:
          需要子类:GregorianCalendar-->一般我们不用
             static Calendar getInstance() ->获取Calendar对象->代表的是子类对象


      3.需要了解的部分:
         time=1583993327522
         YEAR=2020
         MONTH=2->国外(0-11)对应国内(1-12)
         DAY_OF_MONTH=12,
         HOUR=2
         MINUTE=8
         SECOND=47
       4.常用方法:
           public int get(int field)->返回指定的日历字段的值
           public void set(int field,int value)->将给定的日历字段设置为指定的值
           public void add(int field,int amount)->根据日历的规则,为给定的日历字段添加或者减去指定的时间量

         field:日历的字段->static->类名直接调用
            Year  年
            MONTH 月(从0开始,如果想对应国内的月份,可以+1)
            DAY_OF_MONTH:   月中的天(几号)
            HOUR:时 (12小时制)
            HOUR_OF_DAY 时(24小时制)
            MINUTE:分
            SECOND:秒
            DAY_OF_WEEK:周中的天(周几  国外周日算第一天)
 */
public class Calendar01 {
    public static void main(String[] args) {
        //获取Calendar对象
        //getCalendar();

        //get方法
       // get();

        //set方法
        //set();

        //add方法
        add();
    }

    private static void add() {
        //获取Calendar对象
        Calendar calendar = Calendar.getInstance();
        //给指定的年份加2年
        //calendar.add(Calendar.YEAR,2);

        //给指定的年份减2年
       // calendar.add(Calendar.YEAR,-2);
        //int i = calendar.get(Calendar.YEAR);//获取年份

        //给指定的月份加1月
        calendar.add(Calendar.MONTH,10);//0-11
        int i = calendar.get(Calendar.MONTH);//获取月份
        System.out.println(i);
    }

    public static void set() {
       //获取Calendar对象
        Calendar calendar = Calendar.getInstance();
        //设置年份
        //calendar.set(Calendar.YEAR,2021);
        //int i = calendar.get(Calendar.YEAR);//获取年份

        //设置月份
        calendar.set(Calendar.MONTH,2);
        int i = calendar.get(Calendar.MONTH);//获取月份
        System.out.println(i);

    }

    private static void get() {
        //获取Calendar对象
        Calendar calendar = Calendar.getInstance();
        //int i = calendar.get(Calendar.YEAR);获取年
        int i = calendar.get(Calendar.MONTH);//获取月份
        System.out.println(i);
    }

    public static void getCalendar() {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
    }
}
