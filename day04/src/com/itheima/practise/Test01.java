package com.itheima.practise;

import java.text.SimpleDateFormat;
import java.util.Scanner;

/*
二 编程题【Date类、DateFormat类】
2.1 题目一
	请编写程序，从控制台接收一个“生日”，格式：yyyy-MM-dd，程序要能够计算并打印他来到世界xx天。
	注意：“生日”必须早于“当前日期”，否则提示：生日必须早于当前日期！
 */
public class Test01 {
    public static void main(String[] args) {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        System.out.println("输入生日");
        String bri =sc.nextLine();


    }
}
