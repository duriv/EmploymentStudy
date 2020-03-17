package com.itheima.final03_var;
/*
  final修饰成员变量
     1.格式:
        final 数据类型 变量名 = 值
     2.特点:
        a.不能被二次赋值
        b.定义被final修饰的成员变量的时候,需要手动赋值
        c.如果不手动直接赋值,那么我们就要利用所有的构造方法为属性赋值
 */
public class Student {
    //final String name = "涛哥";

    final String name;

    public Student() {
        name = "涛哥";
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

   /* public void setName(String name) {
        this.name = name;
    }*/
}
