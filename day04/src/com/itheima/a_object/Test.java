package com.itheima.a_object;

public class Test{
    public static void main(String[] args) {
        //创建Person对象
        /*
           new空参构造,执行空参构造

           由于空参构造第一行默认有super(),
           所以new Person,先去访问Person的父类
         */
        Person person = new Person();

    }
}
