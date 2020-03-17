package com.itheima.homework.work02;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
2.2 题目二
	请编写程序，从控制台分别接收两个“生日”，格式：yyyy年MM月dd日，程序要能够计算并打印：第一个生日大于/小于第二个生日。
	注意：要求验证生日日期必须早于当前日期
 */
public class Test02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个年");
        int y1 = sc.nextInt();
        System.out.println("请输入第一个月");
        int m1 = sc.nextInt();
        System.out.println("请输入第一个日");
        int d1 = sc.nextInt();

        System.out.println("请输入第二个年");
        int y2 = sc.nextInt();
        System.out.println("请输入第二个月");
        int m2 = sc.nextInt();
        System.out.println("请输入第二个日");
        int d2 = sc.nextInt();

        //当前时间
        Date date3 = new Date();
        long time3 = (long)date3.getTime();
//        System.out.println(date3.getTime());


        //合成时间及判断和计算
        Calendar date1 = Calendar.getInstance();
        date1.set(y1, m1, d1);
        long time1 = (long)date1.getTime().getTime();

        Calendar date2 = Calendar.getInstance();
        date1.set(y2, m2, d2);
        long time2 = (long)date2.getTime().getTime();

        //判断是否大于现在时间
        if (time3 <= time1) {
            System.exit(0);
        }
        if (time3 <= time2) {
            System.exit(0);
        }
        //判断程序要能够计算并打印：第一个生日大于/小于第二个生日
        if (time1 > time2) {
            System.out.println("第一个生日大于第二个生日");
        } else if (time1 == time2) {
            System.out.println("第一个生日等于第二个生日");
        } else if (time1 < time2) {
            System.out.println("第一个生日小于第二个生日");
        }
    }
}
