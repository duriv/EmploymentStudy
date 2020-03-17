package com.itheima.code_area;
/*
   构造代码块(了解)->成员位置
     格式:
       {
         代码
       }

      注意:
         1.构造代码块什么时候执行->创建对象的时候,构造代码块就会执行
         2.每次创建对象的时候,都会执行
         3.优先于构造方法执行的
   静态代码块
 */
public class Person {
    public Person(){
        System.out.println("我是构造方法");
    }

    //构造代码块
    {
        System.out.println("我是构造代码块");
    }
}
