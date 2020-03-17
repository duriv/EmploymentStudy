package com.itheima.c_arrays;

import java.util.Arrays;

/*
    求数组中个元素最大值
        int[] arr1 = {5,4,34,6,7};
 */
public class Demo02Arrays {
    public static void main(String[] args) {
        int[] arr = {5,4,34,6,7};
        //1.定义一个变量,接收数组第一个元素
        int max = arr[0];
        //2.遍历数组
        for (int i = 1; i < arr.length; i++) {
            if (max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);

        System.out.println("----------------");

        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
    }
}
