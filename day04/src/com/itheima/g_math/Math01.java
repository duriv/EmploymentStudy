package com.itheima.g_math;
/*
   Math:
     1.概述:数学类
     2.作用:里面有很多关于数学运算的方法
     3.特点:
        方法都是静态的
        不能new对象的
     4.使用:
         类名直接调用
     5.常用的方法:
        public static int abs(int a)-->求参数的绝对值
        public static double ceil(double a)-->返回大于或等于参数的最小double值，等于一个整数
        public static double floor(double a)-->返回小于或等于参数的最大double值，等于一个整数
        public static int round(float a)-->按照四舍五入返回最接近参数的int

        扩展方法:
        static int max(int a, int b)-->获取两个int型参数的较大值
        static int min(int a, int b)-->获取两个int型参数的较小值

 */
public class Math01 {
    public static void main(String[] args) {
        //public static int abs(int a)-->求参数的绝对值
        System.out.println(Math.abs(-1));

//        public static double ceil(double a)-->返回大于或等于参数的最小double值，(向上取整)
        System.out.println(Math.ceil(2.5));
//        public static double floor(double a)-->返回小于或等于参数的最大double值(向下取整)
        System.out.println(Math.floor(2.4));
//        public static int round(float a)-->按照四舍五入返回最接近参数的int
        System.out.println(Math.round(2.4));

        System.out.println("------------------");

        //static int max(int a, int b)-->获取两个int型参数的较大值
        System.out.println(Math.max(100,200));

        //static int min(int a, int b)-->获取两个int型参数的较小值
        System.out.println(Math.min(200,250));



    }
}
