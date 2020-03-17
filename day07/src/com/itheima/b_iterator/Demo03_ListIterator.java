package com.itheima.b_iterator;

import java.util.ArrayList;
import java.util.ListIterator;

/*
  ListIterator<E> listIterator() -> 迭代器
   void add(E e) ->添加元素
   boolean hasNext()->判断有没有下一个元素
   E next() ->获取下一个元素
 */
public class Demo03_ListIterator {
    public static void main(String[] args) {
        //        1.创建集合,存元素
        ArrayList<String> list = new ArrayList<>();
        list.add("金莲");
        list.add("武大");
        list.add("大官人");
        list.add("宋江");
        list.add("晁盖");
        //2.获取ListIterator<E>
        ListIterator<String> listIterator = list.listIterator();
        while(listIterator.hasNext()){
            String next = listIterator.next();
            if ("大官人".equals(next)){
                //添加元素
                listIterator.add("卢俊义");
            }
        }

        System.out.println(list);
    }
}
