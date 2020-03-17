package com.itheima.b_bigdecimal;

import java.math.BigDecimal;

/*
   BigDecimal:
     1.概述:专门操作小数的
     2.构造:
         BigDecimal(String val)->String要符合小数的规则
     3.常用方法:和BigInteger的方法是一样的

     4.注意:
        BigDecimal如果除不尽,会报错ArithmeticException
 */
public class Demo01BigDecimal {
    public static void main(String[] args) {
        //加法
        sum();
        //减法
        subtract();

        //乘法
        multiply();

        //除法
        divide();
    }

    private static void divide() {
        //1.创建BigDecimal对象
        BigDecimal b1 = new BigDecimal("5.25");
        BigDecimal b2 = new BigDecimal("3.25");
        BigDecimal divide = b1.divide(b2);
        System.out.println(divide);
    }

    private static void multiply() {
        //1.创建BigDecimal对象
        BigDecimal b1 = new BigDecimal("5.25");
        BigDecimal b2 = new BigDecimal("3.25");
        BigDecimal multiply = b1.multiply(b2);
        System.out.println(multiply);
    }

    private static void subtract() {
        //1.创建BigDecimal对象
        BigDecimal b1 = new BigDecimal("5.25");
        BigDecimal b2 = new BigDecimal("3.25");
        BigDecimal subtract = b1.subtract(b2);
        System.out.println(subtract);
    }

    private static void sum() {
        //1.创建BigDecimal对象
        BigDecimal b1 = new BigDecimal("5.25");
        BigDecimal b2 = new BigDecimal("3.25");
        BigDecimal add = b1.add(b2);
        System.out.println(add);
    }
}
