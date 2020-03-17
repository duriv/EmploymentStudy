package com.itheima.homework.work04;
/*
四 编程题【包装类】
4.2 题目二
	请定义学员类，有以下成员属性：
		姓名：String类型
		年龄：int
		身高：double
		婚否：boolean
		性别：char
 */
public class Student {
    private String name;
    private int age;
    private double height;
    private boolean hun;
    private char sex;

    public Student() {
    }

    public Student(String name, int age, double height, boolean hun, char sex) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.hun = hun;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isHun() {
        return hun;
    }

    public void setHun(boolean hun) {
        this.hun = hun;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", hun=" + hun +
                ", sex=" + sex +
                '}';
    }
}
