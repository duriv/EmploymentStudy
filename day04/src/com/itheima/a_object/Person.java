package com.itheima.a_object;

import java.io.FileOutputStream;

/*
   java.lang.Object
      1.概述:是所有类的父类,根类
      2.特点:任何类都会直接或者间接的继承这个Object类
            一个类如果没有明确的写出extends 父类,默认的亲爹就是Object

    private static native void registerNatives();
    static {
        registerNatives();//可以将jvm注册到本地
    }

    native:修饰符,关键字->本地方法
    1.注意:本地方法不是一个抽象方法
    2.本地方法是有方法体的:C语言编写,本地方法的方法体没有对用户开源,简单理解为对Java语言的扩展
                        比如io(读写),Java本身不具备读写功能,调用了都是操作系统的读写功能
                        而操作系统上的读写功能用的就是本地方法
                        windows系统C语言编写
    3.位置:本地方法栈   (堆,栈,方法区,本地方法栈,寄存器)
    4.意义:跟系统打交道
 */
public class Person extends Object{
    public static void main(String[] args) {

    }
}
