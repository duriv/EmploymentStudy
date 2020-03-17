package com.itheima.abstract02;
/*
   1.注意
     抽象方法所在的类定义是抽象类
     抽象类中不一定非得有抽象方法
     抽象类中可以有成员变量,成员方法,抽象方法,构造方法

   2.抽象方法的定义-->abstract
      修饰符 abstract 返回值类型 方法名(参数);

     抽象类的定义
      public abstract class 类名

   3.使用方式:
       抽象类不能new对象,需要通过子去重写抽象方法
       new子类对象,调用重写方法


   4.抽象类的使用场景:
       一般作为父类使用
       抽象类的出现是一种代码的设计思想

 */
public class Animal {
    public void eat(){

    }
}
