package com.itheima.homework.work02;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
二 编程题【Date类、DateFormat类】
2.1 题目一
	请编写程序，从控制台接收一个“生日”，格式：yyyy-MM-dd，程序要能够计算并打印他来到世界xx天。
	注意：“生日”必须早于“当前日期”，否则提示：生日必须早于当前日期！
 */
public class Test01 {
    public static void main(String[] args) {
//        从控制台接收一个“生日”，格式：yyyy-MM-dd，
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入出生年");
        int y= sc.nextInt();
        System.out.println("请输入出生月");
        int m= sc.nextInt();
        System.out.println("请输入出生日");
        int d= sc.nextInt();

        Calendar date=Calendar.getInstance();
        date.set(y,m,d);
        long bri =date.getTime().getTime();
//        System.out.println(bri);
//        947582336073

        Date date1 = new Date();
        long bri1 =date1.getTime();
//        System.out.println(date1.getTime());
//        1584004774931

//        注意：“生日”必须早于“当前日期”，否则提示：生日必须早于当前日期！
        if (bri1>bri){
            //计算差距
            long a =bri1-bri;
//            System.out.println(a);
            long b =a/1000/60/60/24;
            System.out.println(b);
        }else{
            System.out.println("生日必须早于当前日期！");
        }
    }
}
