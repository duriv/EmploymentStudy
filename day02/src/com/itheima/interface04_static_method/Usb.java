package com.itheima.interface04_static_method;
/*
   接口中的静态方法(了解)

     1.格式:
        修饰符 static 返回值类型 方法名(参数){
           方法体
        }
     2.使用:
         接口名直接调用
 */
public interface Usb {
    public static void open(){
        System.out.println("我打开了,进来吧!");
    }
}
