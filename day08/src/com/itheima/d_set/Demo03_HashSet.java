package com.itheima.d_set;
/*
   哈希值:
      1.概述:是由计算机算出来的一个十进制,理解为对象的地址值(逻辑地址)

             内存中分配给对象的地址值和哈希值没啥关系

      2.结论:
          a.String中重写的hashcode方法,获取的是字符串内容的哈希值

          b.内容一样,哈希值一定是一样的
            内容不一样,哈希值也有可能一样
 */
public class Demo03_HashSet {
    public static void main(String[] args) {
        //创建Person对象
        Person p1 = new Person("柳岩", 36);
        Person p2 = new Person("柳岩", 36);
        System.out.println(p1.toString());
        System.out.println(p2);
        System.out.println(p2.hashCode());
        String s = Integer.toHexString(p2.hashCode());
        System.out.println(s);

        System.out.println("-------------------");

        //定义一个String
        String s1 = "abc";
        System.out.println(s1.hashCode());//96354

        String s2 = new String("abc");
        System.out.println(s2.hashCode());//调用的是String重写的hashCode方法

        System.out.println("===========================");
        String s3 = "通话";
        String s4 = "重地";
        System.out.println(s3.hashCode());//1179395
        System.out.println(s4.hashCode());//1179395

    }
}
