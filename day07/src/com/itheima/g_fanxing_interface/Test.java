package com.itheima.g_fanxing_interface;

public class Test {
    public static void main(String[] args) {
        //创建实现类对象
        Scanner01 scanner01 = new Scanner01();
        scanner01.add("哈哈");

        System.out.println("========================");

        //创建实现类对象,确定泛型类型
        ArrayList01<String> list = new ArrayList01<>();
        list.add("hhah");
    }
}
