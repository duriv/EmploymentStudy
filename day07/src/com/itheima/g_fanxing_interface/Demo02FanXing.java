package com.itheima.g_fanxing_interface;

import java.util.Scanner;

/*
   定义带有泛型的接口
     1.格式:
        修饰符 interface 接口名<E>{}
     2.什么时候确定类型
        a.在实现类的时候就确定类型了-->Scanner
        c.在实现类的时候泛型类型还没有确定->等到new对象的时候确定类型
 */
public interface Demo02FanXing <E>{
   public void add(E e);
}
