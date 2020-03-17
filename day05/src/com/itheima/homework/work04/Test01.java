package com.itheima.homework.work04;


import java.util.Scanner;

/*
四 编程题【包装类】
4.1 题目一
	请从控制台接收一个整数的“分数”值，要求用String类型的变量存储，
	程序可以将这个String类型的分数值转换为int值，
	并将分数 + 5分后打印到控制台。

 */
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数的分数值：");
        String a =sc.nextLine();

//程序可以将这个String类型的分数值转换为int值，
    int b =Integer.parseInt(a);
//        System.out.println(b);
//    并将分数 + 5分后打印到控制台。
        int c =b+5;
        System.out.println(c);
    }
}
