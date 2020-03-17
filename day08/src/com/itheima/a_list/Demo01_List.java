package com.itheima.a_list;

import java.util.ArrayList;
import java.util.List;

/*
   List集合->接口
     1.概述:List extends Collection
     2.特点:
         a.元素可重复
         b.有索引的
         c.元素有序->存元素的顺序和取元素的顺序是一样的

     3.方法:
        - `public void add(int index, E element)`: 将指定的元素，添加到该集合中的指定位置上。
        - `public E get(int index)`:返回集合中指定位置的元素。
        - `public E remove(int index)`: 移除列表中指定位置的元素, 返回的是被移除的元素。
        - `public E set(int index, E element)`:用指定元素替换集合中指定位置的元素,返回值的更新前的元素。

 */
public class Demo01_List {
    public static void main(String[] args) {
        //创建对象->利用多态的形式去创建集合对象
        List<String> list = new ArrayList<>();
        list.add("王母娘娘");
        list.add("玉皇大帝");
        list.add("孙悟空");
        list.add("二郎神");
        list.add("沉香");

        //public void add(int index, E element)->往指定索引位置上添加元素
        list.add(2,"柳岩");
        System.out.println(list);

        //public E get(int index)`:返回集合中指定位置的元素
        String s = list.get(0);
        System.out.println(s);

        //public E remove(int index): 移除列表中指定位置的元素, 返回的是被移除的元素
        String s1 = list.remove(2);
        System.out.println(s1);
        System.out.println(list);

        //`public E set(int index, E element)`:用指定元素替换集合中指定位置的元素,返回值的更新前的元素。
        String s2 = list.set(1, "涛哥");
        System.out.println(s2);
        System.out.println(list);


    }
}
