package com.itheima.static02_method;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //可以创建对象调用eat-->不推荐
        Person person = new Person();
        person.eat();


        //类名直接调用-->推荐
        Person.eat();
    }
}
