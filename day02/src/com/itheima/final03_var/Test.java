package com.itheima.final03_var;
/*
   final修饰局部变量

      1.格式:
          final 数据类型 变量名 = 值
      2.特点:
          被final修饰的局部变量,不能被二次赋值

      3.final还可以修饰一个对象
         地址值不能改变,但是对象中的内容(属性)可变

 */
public class Test {
    public static void main(String[] args) {
        int i = 10;
        i = 20;//二次赋值
        System.out.println(i);

        System.out.println("--------------");

        final int j = 100;
       // j = 200;j被final修饰不能被二次赋值

        System.out.println("------------------------");

        Person p1 = new Person();
        System.out.println(p1);
        p1.setName("柳岩");
        p1.setAge(36);
        System.out.println(p1.getName()+"..."+p1.getAge());

        p1 = new Person();
        System.out.println(p1);


        System.out.println("--------------------------");

        final Person p2 = new Person();
        p2.setName("涛哥");
        p2.setAge(18);
        System.out.println(p2.getName()+"..."+p2.getAge());

        //p2 = new Person();

        p2.setName("冰冰");
        p2.setAge(36);

        System.out.println(p2.getName()+"..."+p2.getAge());
    }

}
