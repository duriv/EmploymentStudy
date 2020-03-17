package com.itheima.extends03;
/*
   this:
      代表的是当前对象,可以区分重名的成员变量和局部变量
      哪个对象调用的this所在的方法,this就代表哪个对象

   super:代表的父类对象


   当子类中的成员变量,局部变量,和父类中的成员变量重名了
      在方法中直接访问变量->就近原则,先从方法内部找
      this.成员变量->代表当前对象的成员变量
      super.成员变量->代表父类对象中的成员变量
 */
public class Zi extends Fu {
    //成员变量
     int a = 100;
     public void method(){
         //局部变量
         int a = 200;
         System.out.println(a);//200
         System.out.println(this.a);//100
         System.out.println(super.a);//10
     }
}
