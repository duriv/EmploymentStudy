package com.itheima.domain;
/*
  学生类
 */
public class Student extends Person{
    public Student() {
    }

    public Student(int id, String name, String sex, String birthday, int age) {
        super(id, name, sex, birthday, age);
    }

    @Override
    public String getType() {
        return "学生";
    }

    @Override
    public String getWork() {
        return "学习";
    }


}
