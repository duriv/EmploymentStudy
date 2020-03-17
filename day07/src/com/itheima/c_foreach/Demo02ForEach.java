package com.itheima.c_foreach;

import java.util.ArrayList;
import java.util.Iterator;

/*
   利用增强for遍历数组
 */
public class Demo02ForEach {
    public static void main(String[] args) {
       //定义数组
        int[] arr = {1,2,3,4,5};
        //利用增强for遍历
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
