package com.itheima.abstract04;
/*
   总结:
     抽象类作为父类使用的->属于面向对象中的一部分->是一个设计理念
 */
public abstract class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void eat();
}
