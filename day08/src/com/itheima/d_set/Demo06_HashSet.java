package com.itheima.d_set;

import java.util.HashSet;

/*
   总结:通过源码分析创建HashSet的时候没必要指定容量以及加载因子
 */
public class Demo06_HashSet {
    static final int MAXIMUM_CAPACITY = 1 << 30;

    public static void main(String[] args) {
        //利用空参构造创建HashSet对象
        HashSet<String> hashSet = new HashSet<>();

        /*
           HashSet(int initialCapacity, float loadFactor)
            initialCapacity:初始容量
            loadFactor:指定的加载因子->可以指定存到百分之几扩容
         */

        HashSet<String> set = new HashSet<>(10, 0.1F);

        System.out.println(1 << 30);


        int i = tableSizeFor(9);
        System.out.println(i);

    }

    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }
}
