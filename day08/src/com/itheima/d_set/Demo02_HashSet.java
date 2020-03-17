package com.itheima.d_set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/*
  HashSet是Set下的一个实现类

    1.特点:
        a.不允许出现重复元素
        b.无序(存进去的顺序和第一次取出来的顺序不一致)
        c.没有索引->增强for,迭代器
    2.使用:
        和Collection没区别

    3.HashSet本身没有功能,依靠HashMap进行的

    4.数据结构:哈希表结构
 */
public class Demo02_HashSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("张三");
        hashSet.add("李四");
        hashSet.add("王五");
        hashSet.add("赵六");
        hashSet.add("赵六");
        System.out.println(hashSet);

        //遍历
        Iterator<String> iterator = hashSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("-------------------------------");
        //利用增强for遍历
        for (String s : hashSet) {
            System.out.println(s);
        }

    }
}
