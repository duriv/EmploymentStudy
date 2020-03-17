package com.itheima.extends03;
/*
  局部变量跟随方法进内存
  成员变量跟随对象进内存

  栈:专门运行方法的
  堆:专门new对象的
  方法区:存的是类的信息,方法的信息
        负责加载字节码文件(.class)
 */
public class Test01 {
    public static void main(String[] args) {
        method();
    }

    public static void method(){
        System.out.println("孙悟空是西游记中最纯洁的人");
    }
}
