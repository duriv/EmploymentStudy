package com.itheima.d_set;

import java.util.Comparator;
import java.util.TreeSet;

/*
   TreeSet

   1.概述:
      TreeSet 实现 Set
      基于红黑树的实现
   2.作用:
       使用元素的自然排序规则,对集合中的元素进行排序(内容会使用Comparator比较器进行的默认的升序)

   3.构造:
       TreeSet():进行默认的排序
       TreeSet(Comparator<? super E> comparator) ->指定排序规则
 */
public class Demo09_TreeSet {
    public static void main(String[] args) {
        //利用空参构造创建对象
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(100);
        treeSet.add(50);
        treeSet.add(40);
        System.out.println(treeSet);

        //利用有参构造创建对象,规定排序规则
        TreeSet<Integer> treeSet1 = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                /*
                  前面的减去后面的->升序
                  反之降序
                 */
                return o2-o1;
            }
        });
        treeSet1.add(100);
        treeSet1.add(50);
        treeSet1.add(40);
        System.out.println(treeSet1);
    }
}
