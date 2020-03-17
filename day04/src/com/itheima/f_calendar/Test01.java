package com.itheima.f_calendar;

import java.util.Calendar;
import java.util.Scanner;

/*
  Calendar练习
     需求:输入一个年份,获取出来这个年份对应的2月天数
     步骤:
        1.创建Scanner对象,用于输入年份
        2.获取Calendar对象
        3.设置年月日  (输入的年份,月份,1)->void set(int year, int month, int date)->扩展方法
                     年份:输入的年份
                     月份:2-->对应国内3月份
                     日:1
        4.拿到设置的2月1号(对应国内3月1号),让1号减去1天->得出的2月最后一天
          add(Calendar.DATE,-1)
        5.获取2月的最后一天
        6.输出结果
 */
public class Test01 {
    public static void main(String[] args) {
//        1.创建Scanner对象,用于输入年份
        Scanner sc = new Scanner(System.in);
        System.out.println("请你输入年份:");
        int year = sc.nextInt();
//        2.获取Calendar对象
        Calendar calendar = Calendar.getInstance();
       /* 3.设置年月日  (输入的年份,月份,1)->void set(int year, int month, int date)
        年份:输入的年份
        月份:2-->对应国内3月份
        日:1*/
       calendar.set(year,2,1);//对应的就是3月1号
        /*4.拿到设置的2月1号(对应国内3月1号),让1号减去1天->得出的2月最后一天
        add(Calendar.DATE,-1)*/
        calendar.add(Calendar.DATE,-1);
//        5.获取2月的最后一天
        int day = calendar.get(Calendar.DATE);
//        6.输出结果
        System.out.println(year+"年的2月份有"+day+"天");
    }
}
