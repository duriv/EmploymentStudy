package com.itheima.interface05_var;
/*
   接口中的变量(常量)

   1.定义格式:即使不写static final,默认也有
      public static final 数据类型 变量名 = 值
   2.使用:
      接口名直接调用
   3.注意事项:
      a.不能被二次赋值
      b.需要我们手动赋值(接口毕竟不是类,接口中没有构造方法)
      c.不写static final 默认也有
      d.在接口中,一般定义被static final修饰的常量,名字习惯大写(习惯)

 */
public interface Usb {
    public static final int i = 100;
   // i = 200;

    int j = 200;

    public static final int NUM = 300;
}
