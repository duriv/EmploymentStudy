package com.itheima.duotai03_method;

/*
   多态的前提下:
      成员方法的访问特点
         看new的是谁,先找谁,子类没有,找父类

 */
public class Test {
    public static void main(String[] args) {
        //利用多态的形式创建对象
        Fu fu = new Zi();
        fu.method();

        Fu fu1 = new Fu();
        fu1.method();//嗲用的是父类的方法,因为new的是父类对象
    }
}
