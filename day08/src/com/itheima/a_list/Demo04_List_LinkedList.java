package com.itheima.a_list;

import java.util.LinkedList;

/*
  LinkedList源码分析
 */
public class Demo04_List_LinkedList {
    public static void main(String[] args) {
        //1.创建LinkedList集合对象
        LinkedList<String> list = new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        System.out.println(list.get(1));
    }
}
