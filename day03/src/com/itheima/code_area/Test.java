package com.itheima.code_area;

public class Test {
    public static void main(String[] args) {
        //构造代码块什么时候执行->每次创建对象的时候,构造代码块就会执行
        Person person = new Person();

        //构造代码块是不是每次创建对象时,就会执行(执行几次)
        Person person1 = new Person();
        Person person2 = new Person();

        System.out.println("------------以下代码验证静态代码块---------");

        Student student = new Student();
       // Student student1 = new Student();


    }
}
