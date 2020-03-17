package com.itheima.homework.work05;

import java.util.Arrays;

/*
 编程题【System类】
5.1 题目一
	有以下数组：
		int[] arr = {10,27,8,5,2,1,3,55,88};
	请定义一个新数组，长度为5，并将arr中几个连续的1位数的数字复制到新数组。
 */
public class Test01 {
    public static void main(String[] args) {
        int[] arr = {10,27,8,5,2,1,3,55,88};
        int[] arr1=new int[5];
        System.arraycopy(arr,2,arr1,0,5);
        System.out.println(Arrays.toString(arr1));
    }

}
