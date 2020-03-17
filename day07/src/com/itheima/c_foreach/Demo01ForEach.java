package com.itheima.c_foreach;

import java.util.ArrayList;
import java.util.Iterator;

/*
   增强for-->快键键(容器名.for->回车)
     1.作用:
         遍历数组,集合
     2.格式:
         for(容器中元素的类型 变量名:要遍历的容器名字){
             变量名就是接受的元素
         }



 */
public class Demo01ForEach {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<String> list = new ArrayList<>();
        list.add("努尔哈赤");
        list.add("皇太极");
        list.add("顺治");
        list.add("康熙");
        list.add("雍正");
        list.add("乾隆");
        list.add("嘉庆");

        //利用迭代器遍历
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("------------------------");

        //利用普通for遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("------------------------");

        //利用增强for遍历
        for (String s : list) {
            System.out.println(s);
        }
    }
}
