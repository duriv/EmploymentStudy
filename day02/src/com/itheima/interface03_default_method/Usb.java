package com.itheima.interface03_default_method;
/*
  接口中的默认方法:(了解)
     1.定义格式:
        修饰 default 返回值类型 方法名(参数){
           方法体
        }

     2.使用:
        a.定义实现类  实现接口    implements
        b.实现类中可以重写,也可以不重写
        c.创建实现类对象,去调用默认方法

     3.默认方法使用场景:
           版本升级
 */
public interface Usb {
    //定义默认方法
    public default void open(){
        System.out.println("人家要开启了,进来吧!");
    }
}
