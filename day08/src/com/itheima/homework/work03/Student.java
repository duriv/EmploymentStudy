package com.itheima.homework.work03;
/*
3.2 题目
	请按以下要求顺序编码：
	定义学生类Student，属性：姓名、性别、年龄
 */
public class Teacher {
    private String name;
    private String sex;
    private int age;

    public Teacher() {
    }

    public Teacher(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
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
}
