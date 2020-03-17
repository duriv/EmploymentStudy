package com.itheima.d_set;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
   LinkedHashSet extends HashSet
    1.数据结构:链表+哈希表
    2.特点:
       a.元素唯一
       b.没有索引
       c.有序
 */
public class Demo08_LinkedHashSet {
    public static void main(String[] args) {
        //HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> hashSet = new LinkedHashSet<>();
        hashSet.add("张三");
        hashSet.add("李四");
        hashSet.add("王五");
        System.out.println(hashSet);
    }
}
