package com.itheima.b_iterator;

import java.util.ArrayList;
import java.util.Iterator;

/*
  迭代器:本身是一个Iterator接口

  1.概述:
      是Collection集合的通用遍历方式
  2.怎么获取?
      Iterator<E> iterator() -> 也是Iterator的实现类对象

  3.获取元素->方法
       a.boolean hasNext() -> 判断集合中有没有下一个元素
       b.E next()->获取下一个元素


 */
public class Demo01_Iterator {
    public static void main(String[] args) {
       //创建集合
        ArrayList<String> list = new ArrayList<>();
        //存数据
        list.add("如来佛祖");
        list.add("燃灯佛祖");
        list.add("东来佛祖");
        list.add("旃檀功德佛");
        list.add("斗战胜佛");
        list.add("阿弥陀佛");
        list.add("南无大圣舍利尊王佛");

        //利用迭代器去遍历集合
        Iterator<String> iterator = list.iterator();//代表的是Iterator的实现类->ArrayList的内部类Itr

        /*
          由于我们要循环判断集合中有没有下一个元素,利用while循环
         */
        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }

    }
}
