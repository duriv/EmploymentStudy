package com.itheima.c_arrays;

import java.util.Arrays;

/*
    Arrays类
       1.概述:专门操作数组的工具类
       2.特点:方法都是静态的
              构造方法被私有,不能根据构造方法new对象了
       3.使用:类名直接调用
       4.方法:
           static String toString(int[] a)->返回指定数组内容的字符串表示形式
                                            按照[元素1, 元素2, ...]输出数组元素

           public static void sort(int[] a)->排序  升序

 */
public class Demo01Arrays {
    public static void main(String[] args) {
        //1.定义数组
        int[] arr = {1,2,3,4,5};
        //2.调用Arrays中的toString方法
        String s = Arrays.toString(arr);
        System.out.println(s);

        System.out.println("-----------------");
        int[] arr1 = {5,4,34,6,7};
        //3.调用Arrays中的sort方法
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
