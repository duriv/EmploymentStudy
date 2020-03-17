package com.itheima.duotai04_good;

public class Cat extends Animal{
    //重写eat方法
    public void eat(){
        System.out.println("猫吃鱼");
    }

    //定义特有方法
    public void catchMouse(){
        System.out.println("猫会捉老鼠");
    }
}
