package com.itheima.homework.work01;
/*
一 编程题【Object类】
1.1 题目一
	请按标准格式定义一个“手机类”，它有三个属性：品牌(String)、颜色(String)、价格(double)
	请编写测试类，创建两个“手机对象”并为它们的属性赋值，并能直接打印手机对象的属性信息。
	//使用toString吧。
 */
public class Test1 {
    public static void main(String[] args) {
        Phone phone1 = new Phone("apple","黑色",5499);
//        System.out.println("我有一个手机_品牌是："+phone1.getBrand()+"颜色是："+phone1.getColor()+"价格是："+phone1.getPrice());
        System.out.println(phone1.toString());
        Phone phone2 = new Phone("xiaomi","黑色",3999);
//        System.out.println("我有一个手机_品牌是："+phone1.getBrand()+"颜色是："+phone1.getColor()+"价格是："+phone1.getPrice());
        System.out.println(phone2.toString());
    }
}
