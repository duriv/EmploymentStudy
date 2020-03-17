package com.itheima.homework.work02;
/*
	动物类：
	属性：名称、年龄、性别
	行为：吃饭(非抽象)
 */
public class Animal {
//    	属性：名称、年龄、性别
    private String name;
    private int age;
    private String sex;

    public Animal() {
    }

    public Animal(String name, int age, String sex) {
        this.name = name;
        this.age = age;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
//    	行为：吃饭(非抽象)
    public void eat(){
        System.out.println("动物吃");
    }
}
