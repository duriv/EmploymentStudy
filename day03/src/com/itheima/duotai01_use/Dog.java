package com.itheima.duotai01_use;

public class Dog extends Animal{
    //重写eat方法,指明狗喜欢吃的东西
    public void eat(){
        System.out.println("狗吃屎");
    }

    //特有的内容
    public void lookDoor(){
        System.out.println("狗会看门");
    }
}
