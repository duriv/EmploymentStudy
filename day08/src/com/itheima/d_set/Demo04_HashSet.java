package com.itheima.d_set;

import java.util.HashSet;

/*
   HashSet集合不允许出现重复元素
       先获取的是元素的哈希值,再比较的是内容

   HashSet存储元素如何保证元素唯一:
      先获取哈希值(存储的元素类型重写的hashCode),如果哈希值不一样,直接存
      如果哈希值一样,再比较内容(equals->存储的元素类型重写的equals)
      如果哈希值一样,内容不一样,直接存
      如果两个都一样,认为是同一个元素,HashSet直接去重
 */
public class Demo04_HashSet {
    public static void main(String[] args) {
        //创建HashSet对象
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("abc");//96354
        hashSet.add("abc");//96354
        hashSet.add("通话");//1179395
        hashSet.add("重地");//1179395
        System.out.println(hashSet);
    }
}
