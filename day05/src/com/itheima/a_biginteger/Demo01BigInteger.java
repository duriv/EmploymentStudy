package com.itheima.a_biginteger;

import java.math.BigInteger;

/*
   BigInteger
      4类8种中整数最大的类型是:long
        1.注意:我们以后遇到的数字,有可能超过long的取值范围的,long就接收不了这么大的数
              太大的数,在java中,就不能称之为数,叫对象
        2.BigInteger类:
              构造:
                 BigInteger(String val):将十进制的字符串形式,变成BigInteger对象
                                        字符串的内容需要符合数字规则"1212121212"
        3.方法:
            BigInteger add(BigInteger val)-->和另外一个BigInteger做加法
            BigInteger subtract(BigInteger val)->和另外一个BigInteger做减法
            BigInteger multiply(BigInteger val)->和另外一个BigInteger做乘法
            BigInteger divide(BigInteger val)->和另外一个BigInteger做除法

 */
public class Demo01BigInteger {
    public static void main(String[] args) {
        //创建BigInteger对象
        //BigInteger big1 = new BigInteger("12121212121212121212121212");

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
        BigInteger big1 = new BigInteger("12121212121212121212121212");
        BigInteger big2 = new BigInteger("12121212121212121212121217");
        BigInteger divide = big1.divide(big2);//   /
        System.out.println(divide);
    }

    private static void multiply() {
        BigInteger big1 = new BigInteger("12121212121212121212121212");
        BigInteger big2 = new BigInteger("12121212121212121212121212");
        BigInteger multiply = big1.multiply(big2);
        System.out.println(multiply);
    }

    private static void subtract() {
        BigInteger big1 = new BigInteger("12121212121212121212121212");
        BigInteger big2 = new BigInteger("12121212121212121212121212");
        BigInteger subtract = big1.subtract(big2);
        System.out.println(subtract);
    }

    private static void sum() {
        BigInteger big1 = new BigInteger("12121212121212121212121212");
        BigInteger big2 = new BigInteger("12121212121212121212121212");
        BigInteger add = big1.add(big2);
        System.out.println(add);
    }
}
