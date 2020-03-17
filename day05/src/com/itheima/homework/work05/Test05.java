package com.itheima.homework.work05;

import java.util.Scanner;

/*
5.5 题目五
	程序从控制台接收一个java文件的文件名，例如：test.java，TEST.java，tEst.JAVA，请编程实现以下功能：
	获取，并打印文件名的第一个字符；
	获取，并打印文件的后缀名(包括.符号)，例如：.java
	无论原文件名什么样，最终将其转换为：Test.java的形式，打印转换后的文件名。

 */
public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个java文件的名字：");
        String jname =sc.nextLine();
//        char[] arr =jname.toCharArray();
//        	获取，并打印文件名的第一个字符；
        int a=jname.indexOf(".java");
        System.out.println("获取，并打印文件名的第一个字符："+jname.substring(0,1));
//	获取，并打印文件的后缀名(包括.符号)，例如：.java
        System.out.println("获取，并打印文件的后缀名(包括.符号)："+jname.substring(a));
//	无论原文件名什么样，最终将其转换为：Test.java的形式，打印转换后的文件名。
        System.out.println(jname.replace(jname,"Test.java"));
    }
}
