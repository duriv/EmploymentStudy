package com.itheima.b_collections;

import java.util.ArrayList;
import java.util.Collections;

/*
   Collections:
     1.概述:专门操作集合的工具类
     2.特点:方法都是静态的
     3.使用:类名直接调用
     4.方法:
        - `public static void shuffle(List<?> list) `:打乱集合顺序。
        - `public static <T> void sort(List<T> list)`:将集合中元素按照默认规则排序。
        - `public static <T> void sort(List<T> list，Comparator<? super T> )`:
                                                    将集合中元素按照指定规则排序。
 */
public class Test01 {
    public static void main(String[] args) {
        //1.创建ArrayList集合
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);
        System.out.println(list);

        //`public static void shuffle(List<?> list) `:打乱集合顺序。
        /*Collections.shuffle(list);
        System.out.println(list);*/

        //`public static <T> void sort(List<T> list)`:将集合中元素按照默认规则排序。
        Collections.sort(list);
        System.out.println(list);

        System.out.println("==========================");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("c");
        list1.add("Ae");
        list1.add("b");
        list1.add("Ba");
        Collections.sort(list1);
        System.out.println(list1);

    }
}
