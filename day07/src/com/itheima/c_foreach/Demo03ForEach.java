package com.itheima.c_foreach;

import java.util.ArrayList;

/*
  需求:用增强for遍历
   定义一个集合,存储元素为:金莲 武大 大官人 宋江 晁盖
   遍历集合,遍历出来的元素如果是大官人,往集合中添加"卢俊义"


  总结:
     增强for在遍历集合的时候,底层原理是迭代器,所以,不能用增强for的过程中改变集合长度
     增强for在遍历数组的时候,底层原理不是迭代器
 */
public class Demo03ForEach {
    public static void main(String[] args) {
        //1.创建集合,存元素
        ArrayList<String> list = new ArrayList<>();
        list.add("金莲");
        list.add("武大");
        list.add("大官人");
        list.add("宋江");
        list.add("晁盖");

        for (String s : list) {
            if (s.equals("大官人")){
                list.add("卢俊义");//不行,不能用增强for的过程中改变集合长度
            }
        }
        System.out.println(list);
    }
}
