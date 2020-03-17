package com.itheima.interface02_abstract_method;
/*
   接口中的抽象方法(重点)
      1.定义格式:即使不写abstract,默认也有
         public abstract 返回值类型 方法名(参数);

      2.使用:
         a.定义一个实现类,实现接口--> implements
            实现类类名 implements 接口名
         b.重写接口中的所有抽象方法
         c.创建实现类对象(接口不能直接new对象),调用重写的方法
 */
public interface Usb {
    //USB打开
    public abstract void open();

    //定义一个USB关闭方法
    public void close();

    //定义一个method方法
   // void method();
}
