package com.itheima.f_fanxing_method;
/*
   定义泛型的方法:
      1.格式:
         修饰符<代表泛型的变量> 返回值类型 方法名(参数){}

      2.什么时候确定类型:调用方法的时候,确定泛型的类型
 */
public class Demo01Method {
        public <E> void method(E e){
            System.out.println(e);
        }
}
