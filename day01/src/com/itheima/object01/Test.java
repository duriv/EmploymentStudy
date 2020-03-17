package com.itheima.object01;

import java.util.Arrays;

/*
   面向对象
     1.概述:自己的事情自己不做,找别人帮我去做->万物皆对象->懒
     2.目的:调用对象的功能,帮我们实现某一种需求
     3.什么时候使用:在一个类中想使用另外一个类的功能,我们就可以面向对象了
                  调用这个类中已经提供好的方法,来实现我们自己想要的功能

   学习方法:
      类->引用数据类型  ->  new对象  点方法
      Scanner->引用数据类型  -> java.util->new对象  点next()
      Random->引用数据类型->java.util->new对象  点nextInt
      String->引用数据类型->java.lang->new String
      StringBuilder->引用数据类型->java.lang->  new对象  .append .toString
      ArrayList->引用数据类型->new 对象

      数组->new int[数组长度]



 */
public class Test {
    public static void main(String[] args) {
        //定义数组->   [1,2,3,4]
        int[] arr = {1,2,3,4};

        System.out.print("[");
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1){
                System.out.print(arr[i]+"]");
            }else{
                System.out.print(arr[i]+",");
            }
        }

        System.out.println();
        System.out.println(Arrays.toString(arr));

        System.out.println("---------------------");
        Person person = new Person();
        person.setName("柳岩");
        person.setAge(36);
        System.out.println(person.getName()+"..."+person.getAge());

    }
}
