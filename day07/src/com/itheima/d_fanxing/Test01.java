package com.itheima.d_fanxing;

import java.util.ArrayList;

/*
    泛型:
       使用的时候:可以规定数据类型
 */
public class Test01 {
    public static void main(String[] args) {
        //创建ArrayList集合
        ArrayList<String> list = new ArrayList<>();
        list.add("金莲");
        list.add("武松");
        list.add("王婆");
        String s = list.get(0);
        System.out.println(s);

        System.out.println("--------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);


    }
}
