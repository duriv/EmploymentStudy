package com.itheima.homework.work02;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
二 编程题【Arrays类】
2.1 题目一
	有以下数组定义：
		int[] arr = {1,332,43,25,3324,34,335,4,45,2,43,52,54};
	要求：
	请打印数组所有元素
	请对数组元素进行“升序”排序
	请对排序后的数组再次打印。

 */
public class Test01 {
    public static void main(String[] args) {
        int[] arr = {1,332,43,25,3324,34,335,4,45,2,43,52,54};
//	请打印数组所有元素
        System.out.println(Arrays.toString(arr));

//	请对数组元素进行“升序”排序
        Arrays.sort(arr);
//	请对排序后的数组再次打印。
        System.out.println(Arrays.toString(arr));
    }
}
