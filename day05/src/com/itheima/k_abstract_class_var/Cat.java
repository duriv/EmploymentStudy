package com.itheima.k_abstract_class_var;

/*
  动物的子类
 */
public class Cat extends Animal {
    @Override
    public void sleep() {
        System.out.println("小猫爱睡觉!");
    }
    @Override
    public String toString() {
        return "一直可爱的小猫咪";
    }

}
