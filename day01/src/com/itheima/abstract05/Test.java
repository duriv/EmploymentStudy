package com.itheima.abstract05;

public class Test {
    public static void main(String[] args) {
        //创建Javaee对象
        JavaEE javaEE = new JavaEE();
        javaEE.setId(1);
        javaEE.setName("涛哥");
        javaEE.work();

        //创建网络维护工程师对象
        WangWei wangWei = new WangWei();
        wangWei.setId(2);
        wangWei.setName("帅帅");
        wangWei.work();

        System.out.println("----------");

        WangWei wangWei1 = new WangWei(36, "柳岩");
        wangWei1.work();
    }
}
