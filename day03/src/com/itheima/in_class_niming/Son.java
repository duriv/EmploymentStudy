package com.itheima.in_class_niming;
/*
   如果用匿名内部类的话:子类无需创建了,被代替了
 */
public class Son extends Person{
    @Override
    public void eat() {
        System.out.println("我喜欢吃热干面");
    }
}
