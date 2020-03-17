package com.itheima.homework.work02;
/*
	猫类继承自动物
	行为：捉老鼠
 */
public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, int age, String sex) {
        super(name, age, sex);
    }

    public void run(String name){
        System.out.println(name+"捉老鼠");
    }
}
