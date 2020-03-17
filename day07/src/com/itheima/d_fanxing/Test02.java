package com.itheima.d_fanxing;

import java.util.ArrayList;

/*
   定义的时候定义泛型好处:让代码更通用

   使用的时候好处:固定数据的类型,防止造成类型转换异常->确定泛型的具体类型
 */
public class Test02 {
    public static void main(String[] args) {
        /*
           创建集合的时候,不加泛型
           如果泛型不指定具体类型,集合默认元素类型Object类型
         */
        //ArrayList list = new ArrayList();
        ArrayList<String> list = new ArrayList<>();
        //存储元素
        list.add("柳岩");
        list.add("天海翼");
        list.add("波多");
        list.add("大桥");
        list.add("悠亚");
        //list.add(1);

        /*
           需求:遍历集合,求出每个元素的长度
         */

        for (Object o : list) {
            //由于Object调用不来String的length方法,所以向下转型
            String s = (String)o;
            System.out.println(s.length());
        }

    }
}
