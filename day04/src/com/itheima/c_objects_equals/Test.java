package com.itheima.c_objects_equals;

import java.util.Objects;

/*
   Objects:工具类
       1.特点:方法都是静态的
       2.访问方式:类名直接调用

   //容忍有null的参与,比较传递的参数的时候,不会出现空指针异常
   public static boolean equals(Object a, Object b) {
       return (a == b) || (a != null && a.equals(b));
   }
 */
public class Test {
    public static void main(String[] args) {
       String s = null;
       String s1 = "abc";
      // System.out.println(s.equals(s1));
       System.out.println(s1.equals(s));


        System.out.println("----------------------");
        boolean equals = Objects.equals(s, s1);
        System.out.println(equals);
    }
}
