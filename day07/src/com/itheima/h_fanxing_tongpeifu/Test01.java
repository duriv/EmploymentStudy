package com.itheima.h_fanxing_tongpeifu;

import java.util.ArrayList;

/*
   泛型通配符:一般使用在方法的参数上-->   ?
 */
public class Test01 {
    public static void main(String[] args) {
        //创建对象
        ArrayList<String> list = new ArrayList<>();
        list.add("涛哥");
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);

        method(list);
        method(list1);
    }

    //定义方法,遍历main方法中的两个集合,参数中的问号对应传递过来的所有类型
    public static void method(ArrayList<?> list){
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
