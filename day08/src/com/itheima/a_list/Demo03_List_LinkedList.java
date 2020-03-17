package com.itheima.a_list;

import java.util.LinkedList;

/*
   需求:
     往集合中添加5个元素,之后
        1.直接再集合开头添加元素
        2.在集合末尾添加元素
        3.删除集合第一个元素
        4.删除集合最后一个元素

   LinkedList implements List
     1.作用:有大量的特有方法去操作首尾的元素
     2.数据结构:
          链表结构->双向链表
     3.特有的方法
          - `public void addFirst(E e)`:将指定元素插入此列表的开头。
          - `public void addLast(E e)`:将指定元素添加到此列表的结尾。
          - `public E getFirst()`:返回此列表的第一个元素。
          - `public E getLast()`:返回此列表的最后一个元素。
          - `public E removeFirst()`:移除并返回此列表的第一个元素。
          - `public E removeLast()`:移除并返回此列表的最后一个元素。
          - `public E pop()`:从此列表所表示的堆栈处弹出一个元素。
          - `public void push(E e)`:将元素推入此列表所表示的堆栈。
          - `public boolean isEmpty()`：如果列表不包含元素，则返回true。


 */
public class Demo03_List_LinkedList {
    public static void main(String[] args) {
        //创建LinkedList集合对象
        LinkedList<String> list = new LinkedList<>();
        //添加元素
        list.add("哆啦A梦");
        list.add("大雄");
        list.add("胖虎");
        list.add("静香");
        list.add("小夫");
        list.add("阿童木");
        list.add("江流儿");
        System.out.println(list);
        System.out.println("-------------------------------");
        //`public void addFirst(E e)`:将指定元素插入此列表的开头。
        list.addFirst("涛哥");
        System.out.println(list);
        System.out.println("-------------------------------");
        //`public void addLast(E e)`:将指定元素添加到此列表的结尾。
        list.addLast("哪吒");
        System.out.println(list);

        System.out.println("----------------------------");
        //`public E removeFirst()`:移除并返回此列表的第一个元素。
        //String s = list.removeFirst();
        //System.out.println(s);
       // System.out.println(list);

        System.out.println("---------------------------");

        //`public E pop()`:从此列表所表示的堆栈处弹出一个元素。
       /* String pop = list.pop();
        System.out.println(pop);
        System.out.println(list);*/

        System.out.println("-----------------------");

        //- `public void push(E e)`:将元素推入此列表所表示的堆栈。
        list.push("百变小樱魔术卡");
        System.out.println(list);
    }
}
