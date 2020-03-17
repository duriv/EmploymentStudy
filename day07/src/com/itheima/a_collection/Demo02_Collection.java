package com.itheima.a_collection;

import java.util.ArrayList;
import java.util.Collection;

/*
   Collection集合:
     1.概述:单列集合的顶级接口,不能直接new Collection,通过实现类去new ArrayList
     2.方法:
        - `public boolean add(E e)`：  把给定的对象添加到当前集合中 。
        - `public void clear()` :清空集合中所有的元素。
        - `public boolean remove(E e)`: 把给定的对象在当前集合中删除。
        - `public boolean contains(Object obj)`: 判断当前集合中是否包含给定的对象。
        - `public boolean isEmpty()`: 判断当前集合是否为空。
        - `public int size()`: 返回集合中元素的个数。
        - `public Object[] toArray()`: 把集合中的元素，存储到数组中

 */
public class Demo02_Collection {
    public static void main(String[] args) {
        //创建Collection集合对象
        Collection<String> collection = new ArrayList<>();
        //public boolean add(E e)`：  把给定的对象添加到当前集合中
        collection.add("孙悟空");
        collection.add("沙悟净");
        collection.add("猪悟能");
        collection.add("唐三藏");
        collection.add("小白龙");
        collection.add("柳岩");
        System.out.println(collection);

        //`public void clear()` :清空集合中所有的元素。
        //collection.clear();
        //System.out.println(collection);

        //`public boolean remove(E e)`: 把给定的对象在当前集合中删除。
        boolean b = collection.remove("柳岩");
        System.out.println(b);
        System.out.println(collection);

        //public boolean contains(Object obj)`: 判断当前集合中是否包含给定的对象。
        boolean b1 = collection.contains("柳岩");
        System.out.println(b1);

        //public boolean isEmpty()`: 判断当前集合是否为空

        //collection.clear();

        boolean empty = collection.isEmpty();
        System.out.println(empty);

        //`public int size()`: 返回集合中元素的个数。
        int size = collection.size();
        System.out.println(size);

        //public Object[] toArray()`: 把集合中的元素，存储到数组中
        Object[] objects = collection.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }

    }
}
