package com.itheima.in_class;
/*
   内部类
     1.概述:在一个类中存在另外一个类
     2.格式:
        public class A{
           class B{

           }
        }
        类A就是类B的外部类
        类B就是类A的内部类
     3.注意事项
        内部类可以直接访问外部类的成员
        外部类不可以直接访问内部类成员

     4.使用内部类成员->想办法new内部类的对象
         根据外部类对象new内部类对象

       外部类类名.内部类类名 对象名 = new 外部类对象().new 内部类对象()


 */
public class Person {
    int i = 100;


    class Heart{
        int j = 200;
        //定义内部类的方法
        public void jump(){
            System.out.println(j);
            System.out.println(i);
        }
    }

    //定义一个方法
    public void out_Method(){
        System.out.println(i);

        //外部类类名.内部类类名 对象名 = new 外部类对象().new 内部类对象()
        Heart heart = new Person().new Heart();

        System.out.println(heart.j);
    }
}
