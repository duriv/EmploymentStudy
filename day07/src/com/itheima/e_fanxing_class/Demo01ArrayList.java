package com.itheima.e_fanxing_class;
/*
   定义一个泛型类
     格式:
        修饰符 class 类名<代码泛型的变量>{

        }

      什么时候确定类型:
        创建对象的时候确定类型

 */
public class Demo01ArrayList<E> {
    public void add(E e){
        System.out.println(e);
    }
}
