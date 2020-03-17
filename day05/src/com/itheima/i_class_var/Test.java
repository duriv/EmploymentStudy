package com.itheima.i_class_var;
/*
   1.定义一个类A
   2.定义一个类B
     类A作为类B的成员变量
   3.先new类A的对象,为类A的属性赋值
   4.new 类B的对象,将类A对象作为参数为类B中的属性(类A)赋值
 */
public class Test {
    public static void main(String[] args) {
        //创建IDCard对象
        IDCard idCard = new IDCard("1212121212", "河北省");
        //为Person赋值
        Person person1 = new Person("柳岩", idCard);
        System.out.println(person1);
    }
}
