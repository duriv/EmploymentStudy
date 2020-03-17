package com.itheima.interface06_notice;
/*
    接口的特点:
       1.接口可以多实现(一个实现类可以同时实现多个接口)->需要重写接口中的所有抽象方法
          实现类 implements 接口A,接口B
       2.接口和接口之间可以多继承(一个接口可以同时继承一个或者多个接口)
          接口A extends 接口B,接口C...
       3.一个类可以继承一个父类的同时实现一个或者多个接口-->重写父类和接口中的抽象方法
          实现类 extends 父类 implements 接口A,接口B...
 */
public class Test {
    public static void main(String[] args) {
        //创建实现类对象
        InterfaceImpl01 interfaceImpl01 = new InterfaceImpl01();
        interfaceImpl01.methodA();
        interfaceImpl01.methodB();
    }
}
