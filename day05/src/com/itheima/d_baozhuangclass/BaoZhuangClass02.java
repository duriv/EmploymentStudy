package com.itheima.d_baozhuangclass;

import java.util.ArrayList;

/*
      手动装箱:
         构造:
            Integer(int i)->将int型转成Integer对象
            Integer(String s)->符合数字规则的字符串转成Integer对象
         方法:
            static Integer valueOf(int i)
            static Integer valueOf(String s) ->字符串要符合数字规则
      手动拆箱:
          intValue()
 */
public class BaoZhuangClass02 {
    public static void main(String[] args) {
       //method01();//构造装箱
        method02();//利用方法装箱
        method03();//拆箱
    }

    private static void method03() {
        Integer integer = new Integer(1);
        int i = integer.intValue();
        System.out.println(i);
    }

    private static void method02() {
//        static Integer valueOf(int i)
        Integer integer = Integer.valueOf(12);
        System.out.println(integer);
//        static Integer valueOf(String s) ->字符串要符合数字规则
        Integer integer1 = Integer.valueOf("111");
        System.out.println(integer1);
    }

    private static void method01() {
        Integer integer = new Integer(10);
        System.out.println(integer+100);

        //Integer(String s)->符合数字规则的字符串转成Integer对象
        //Integer integer1 = new Integer("abc");不行,因为abc不是数字规则
        Integer integer1 = new Integer("12");
        System.out.println(integer1+1);

    }
}
