package com.itheima.code_area;
/*
   静态代码块(重点)
     1.格式
        static{

        }

     2.考虑的问题:
        a.啥时候执行:随着类的加载而执行,优先于构造方法执行的
        b.执行几次


     3.静态代码块,构造代码块,构造方法的执行优先级
        静态代码块最先执行->构造代码块->构造方法

 */
public class Student {
    public Student(){
        System.out.println("我是学生类的空参构造");
    }

    //构造代码块
    {
        System.out.println("我是构造代码块");
    }

    //静态代码块
    static{
        System.out.println("我是静态代码块");
    }

}
