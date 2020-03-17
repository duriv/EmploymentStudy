package com.itheima.h_system;

import java.util.Arrays;

/*
    需求:
       定义一个数组 {1,2,3,4,5}
       将数组中的元素放到另外一个数组中

       原始步骤:
          1.定义一个新数组
          2.遍历老数组,将老数组中的元素都遍历出来
          3.一边遍历,一边存到新数组中

     方法:System中的方法->数组复制
        static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
                              src:源数组
                              srcPos:从源数组的哪个索引开始复制
                              dest:目标数组
                              destPos:从目标数组哪个索引开始粘贴
                              length:复制多少个
 */
public class System03_kuozhan {
    public static void main(String[] args) {
        //定义数组
         int[] arr = {1,2,3,4,5};
         //定义新数组
        int[] arr1 = new int[arr.length];

        //数组复制
        System.arraycopy(arr,0,arr1,0,arr.length);

        //直接将数组中的元素按照指定的格式打印:[元素1, 元素2, ....]
        System.out.println(Arrays.toString(arr1));
    }
}
