package com.itheima.domain;
/*
   教师类
 */
public class Teacher extends Person{
    public Teacher() {
    }

    public Teacher(int id, String name, String sex, String birthday, int age) {
        super(id, name, sex, birthday, age);
    }

    @Override
    public String getType() {
        return "教师";
    }

    @Override
    public String getWork() {
        return "讲课";
    }
}
