package com.itheima.homework.work02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
2.4 题目四
	请编写程序，从控制台接收一个“日期”，格式：yyyy-MM-dd，程序将其转换为：xxxx年xx月xx日的格式输出到控制台。

 */
public class Test04 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入年!!");
        String d = sc.nextLine();

        Date date1=sdf.parse(d);
        String date2=sdf.format(date1);
//        System.out.println(date2);
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日");
        String date3=sdf1.format(date1);
        System.out.println(date3);

    }

}
