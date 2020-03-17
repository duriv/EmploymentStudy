package com.itheima.duotai04_good;

public class Dog extends Animal{
    //重写eat方法
    public void eat(){
        System.out.println("狗喜欢吃骨头");
    }

    //定义特有方法
    public void lookDoor(){
        System.out.println("狗能看门");
    }
}
