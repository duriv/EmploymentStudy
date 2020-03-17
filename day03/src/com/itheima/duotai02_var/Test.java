package com.itheima.duotai02_var;
/*
   多态的前提下:
      成员变量的访问特点
         看等号左边是谁,就调用谁
 */
public class Test {
    public static void main(String[] args) {
        //利用多态的形式创建对象
        Fu fu = new Zi();
        System.out.println(fu.i);
    }
}
