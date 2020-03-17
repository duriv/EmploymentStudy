package com.itheima.homework.work05;

import java.util.Arrays;

/*
5.2 题目二
	有以下数组：
		int[] arr = {55,77,0,88,22,44,33};
	请编程实现：将后四个数字依次前移一位，移动后，最后一位置为0.
 */
public class Test02 {
    public static void main(String[] args) {
        int[] arr = {55,77,0,88,22,44,33};

        int[] arr1=new int[arr.length];
        System.arraycopy(arr,0,arr1,0,2);
        System.arraycopy(arr,3,arr1,2,4);
        System.out.println(Arrays.toString(arr1));
    }
}
