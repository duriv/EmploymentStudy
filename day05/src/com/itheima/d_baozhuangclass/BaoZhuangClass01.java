package com.itheima.d_baozhuangclass;

import java.util.ArrayList;

/*

   包装类:基本数据类型所对应的引用数据类型
         基   本                  引  用
          byte                    Byte
          short                   Short
          int                     Integer
          long                    Long
          float                   Float
          double                  Double
          char                    Character
          boolean                 Boolean
    注意:
       拆箱和装箱(自动)
       装箱:将基本数据类型转成引用数据类型(包装类)
       拆箱:将引用数据类型(包装类)转成基本数据类型

 */
public class BaoZhuangClass01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);//自动装箱
        System.out.println(list);

        //Integer integer = list.get(0);

        int i = list.get(0);//自动拆箱
        System.out.println(i+10);
    }
}
