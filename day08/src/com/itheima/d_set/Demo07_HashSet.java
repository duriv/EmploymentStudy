package com.itheima.d_set;

import java.util.HashSet;

/*
   HashSet存储元素的源码分析(分析元素存到了数组的哪个索引上)
   可以理解为HashMap中的put方法(分析元素存到了数组的哪个索引上)
 */
public class Demo07_HashSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("abc");//96354
    }
}
