package com.itheima.homework.work05;

import com.sun.prism.shader.Texture_ImagePattern_AlphaTest_Loader;

import java.util.Scanner;

/*
5.2 题目二
	请用户从控制台输入一个java文件的名字，例如：Test.java，请编程实现以下功能：
	判断此文件名是否以“.java”结尾，并打印结果
	获取此文件中.符号的索引位置，并打印结果

 */
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个java文件的名字：");
        String jname =sc.nextLine();
//        	判断此文件名是否以“.java”结尾，并打印结果
        if (jname.endsWith(".java")){
            System.out.println("此文件名是为“.java”结尾的");
        }else{
            System.out.println("你输入的和要求的不一致");
            System.exit(0);
        }
//	获取此文件中.符号的索引位置，并打印结果
        System.out.println("“.”的位置是："+jname.indexOf("."));
    }
}
