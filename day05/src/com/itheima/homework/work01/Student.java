package com.itheima.homework.work01;
/*
一 编程题【BigDecimal类】
1.2 题目二
	有以下学员信息：
		张三,男,20,79.5
		李四,女,21,80.2
		王五,男,22,77.9
		周六,男,20,55.8
		赵七,女,21,99.9
	请定义学员类，属性：姓名、性别、年龄、分数
 */
public class Student {
    private String name;
    private String sex;
    private int age;
    private double grade;

    public Student() {
    }

    public Student(String name, String sex, int age, double grade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
