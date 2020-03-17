package com.itheima.d_set;

import java.util.HashSet;

/*
   HashSet存储自定义类型如何保证元素唯一->重写hashCode和equals方法

   Student类中重写了hashCode和equals方法

   存到HashSet集合中,先调用重写的hashCode方法,而重写的hashCode是获取的Student属性内容的哈希值
   调用equals,就是调用的重写的equals,而Student中重写的equals方法比较的内容
 */
public class Demo05_HashSet {
    public static void main(String[] args) {
        //创建HashSet,存储Student对象
        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(new Student("柳岩",36));
        hashSet.add(new Student("柳岩",36));

        System.out.println(hashSet);
    }
}
