package com.itheima.b_object_tostring_equals;

import java.util.ArrayList;

/*

   Object类中的equals方法->判断两个对象是否相等

   System.out.println(p1.equals(p2));

    public boolean equals(Object obj) {//p2
        return (this == obj);//this代表的是p1
    }

    ==:
      针对于引用数据类型:比较的是地址值
      针对于基本数据类型:比较的是数据值

   总结:
      我们如果不重写equals方法,默认比较的是Object中的equals方法,比较的是地址值
      如果我们重写了equals方法,再比较地址值就没意义了,我们应该比较的是内容

   小结:
      1.如果想直接输出对象名,不是地址值,重写toString->alt+insert->toString
      2.如果比较两个对象内容是否相等,重写equals方法->alt+insert->equals and hashcode

 */
public class Test02_equals {
    public static void main(String[] args) {
        Person p1 = new Person("柳岩", 36);
        Person p2 = new Person("柳岩", 36);

        //调用equals方法传递不是Person类型,是集合类型
        ArrayList<String> list = new ArrayList<>();

        //System.out.println(p1.equals(p2));
        //System.out.println(p1.equals(list));

       // System.out.println(p1.equals(null));//如果传递null

        System.out.println(p1.equals(p1));//如果传递的是自己呢?
        System.out.println("-------------------");

        String s = "abc";
        String s1 = new String("abc");
        System.out.println(s.equals(s1));
    }
}
