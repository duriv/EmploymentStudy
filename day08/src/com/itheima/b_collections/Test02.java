package com.itheima.b_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
  - `public static <T> void sort(List<T> list，Comparator<? super T> )`:
                                                    将集合中元素按照指定规则排序。

     1.Comparator:是一个接口->比较器
     2.使用:利用实现类去使用
     3.使用的时候,重写Comparator中的方法
        int compare(T o1, T o2)  -->  前面的参数减去后面的参数(升序),反过来(降序)

 */
public class Test02 {
    public static void main(String[] args) {
       //创建集合,存储Person对象
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("柳岩",36));
        list.add(new Person("涛哥",18));
        list.add(new Person("波多",30));

        //排序->错误:list中存的是自定义对象,sort不知道按照什么去排序,需要指定排序规则
        //Collections.sort(list);

        //public static <T> void sort(List<T> list，Comparator<? super T> )`:
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                //return o1.getAge()-o2.getAge();//-->升序
                return o2.getAge()-o1.getAge();//-->降序
            }
        });

        System.out.println(list);
    }
}
