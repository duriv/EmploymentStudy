package com.itheima.extends08;
/*
   this:
      代表的是当前对象
      哪个对象调用this所在的方法,this就代表谁

   调用本类的成员变量->在本类中  this.成员变量名
   调用本类的成员方法->在本类中  this.方法名
   调用本类的构造方法->在本类的构造方法中  this()或者this(参数)-->要写在构造第一行

   注意:
      1.super如果和this同时在构造中手动写出,是不行的,报错的->一山不容二虎
      2.this调用本类构造时不能相互调用->调死了
 */
public class Zi {
    int i = 10;

    public Zi(){
        //this(1);
        System.out.println("我是无参构造");

    }

    public Zi(int i){
        this();
        System.out.println("我是有参构造");
    }

    public void method(){
        System.out.println("hia hia hia");
        int i = 20;
        System.out.println(this.i);
    }
    public void method01(){
        System.out.println(this);
        //method();
        this.method();//有点脱了裤子放屁
    }
}
