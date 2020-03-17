package com.itheima.extends02;
/*
   在继承中成员变量的访问特点:
        不重名:
           如果new的父类对象,只能调用自己的
           如果new的子类对象,既能调用自己特有的,还能调用父类的(非私有)
        重名:
           看等号左边是谁,就先调用谁,如果子类没有,找父类
 */
public class Test {
    public static void main(String[] args) {
       //创建父类对象
        Fu fu = new Fu();
        System.out.println(fu.a);//10

        //创建子类对象
        Zi zi = new Zi();
        System.out.println(zi.b);//100
        System.out.println(zi.a);//1000
    }
}
