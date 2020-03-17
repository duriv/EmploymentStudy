package com.itheima.extends09;
/*
  子类

     父类中的private,子类可以继承,但是访问不了
     父类中的构造方法,子类无法继承
 */
public class Dog extends Animal{

    public void eat(){
        System.out.println("狗吃屎");
    }
    public void lookDoor(){
        System.out.println("看门");
    }
}
