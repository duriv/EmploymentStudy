package com.itheima.abstract03;
/*
  子类继承父类只有,可以理解为子类拥有了父类的成员
 */
public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃屎");
    }

    @Override
    public void drink() {
        System.out.println("狗喝水");
    }
}
