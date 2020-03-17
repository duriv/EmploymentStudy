package com.itheima.b_iterator;

import java.util.ArrayList;
import java.util.Iterator;

/*
   1.使用迭代器的注意事项:->原因:底层源码实现决定->预习操作次数和实际操作次数不一致

   2.需求:
       定义一个集合,存储元素为:金莲 武大 大官人 宋江 晁盖
       遍历集合,遍历出来的元素如果是大官人,往集合中添加"卢俊义"
   3.步骤:
       1.创建集合,存元素
       2.调用iterator()获取迭代器对象
       3.循环迭代元素,在迭代的过程中,判断获取出来的元素是不是"大官人"
         如果是,调用add,往集合中添加"卢俊义"
   4.ConcurrentModificationException:并发修改异常:
       使用迭代器去操作元素的过程中,不要改变集合的长度
 */
public class Demo02_Iterator {
    public static void main(String[] args) {
//        1.创建集合,存元素
        ArrayList<String> list = new ArrayList<>();
        list.add("金莲");
        list.add("武大");
        list.add("大官人");
        list.add("宋江");
        list.add("晁盖");
//        2.调用iterator()获取迭代器对象
        Iterator<String> iterator = list.iterator();
       /* 3.循环迭代元素,在迭代的过程中,判断获取出来的元素是不是"大官人"
        如果是,调用add,往集合中添加"卢俊义"*/
       while(iterator.hasNext()){
           String element = iterator.next();
           if (element.equals("大官人")){
               list.add("卢俊义");
           }
       }

       //看看集合中有没有将"卢俊义"存到集合中
        System.out.println(list);
    }
}
