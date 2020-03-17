package com.itheima.public_private01;

import cn.itcast.day03.public_private.MyClass;

/*
   此类和MyClass毛关系都没有
 */
public class MyTest {
    public void method(){
        MyClass myClass = new MyClass();
        System.out.println(myClass.num);
    }
}
