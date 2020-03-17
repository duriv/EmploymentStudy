package com.itheima.homework.work04;

import java.util.Scanner;

/*
四 编程题【包装类】
4.2 题目二
	请定义学员类，有以下成员属性：
		姓名：String类型
		年龄：int
		身高：double
		婚否：boolean
		性别：char

	请从控制台接收以下数据：
		姓名：王哈哈
		年龄：24
		身高：1.82
		婚否：false
		性别：男
		以上数据要求全部使用String类型接收
	请创建“学员对象”，并将所有数据转换后，存储到这个对象中，最后打印此对象的所有属性。

 */
public class Tset02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的名字：");
        String name =sc.nextLine();
        System.out.println("请输入你的年龄：");
        int age =sc.nextInt();
        System.out.println("请输入你的身高：");
        double height =sc.nextDouble();
        System.out.println("请输入你是否结婚：");
        boolean hun=sc.nextBoolean();
        System.out.println("请输入你的性别：");
        char sex=sc.next().charAt(0);

        Student stu = new Student(name,age,height,hun,sex);

        System.out.println(stu);

    }
}
