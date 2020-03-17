package com.itheima.final02_method;
/*
   final修饰一个方法
     1.格式:
        修饰符 final 返回值类型 方法名(参数){
           方法体
        }

     2.特点:
        被final修饰的方法不能被重写的

     3.注意:
        abstract 和 final  两个关键字不能连用

           final修饰的方法不能被重写
           但是,abstract修饰的方法,一定需要子类重写的
 */
public abstract class Animal {
    public final void eat(){
        System.out.println("动物要吃饭");
    }

   // public abstract final void drink();
}
