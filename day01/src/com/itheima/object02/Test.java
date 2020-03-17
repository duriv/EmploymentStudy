package com.itheima.object02;
/*
   匿名对象

   1.匿名:这个对象new的时候不给人家起名字
   2.在new对象的时候,哪一部分是对象的名字?
        等号左边->引用
   3.匿名对象的表现形式:
        new对象的时候,不要等号左边的引用
   4.使用场景:
        如果说是简单的让一个方法去执行->可以用匿名对象
        但是,不要使用匿名对象为属性赋值
 */
public class Test {
    public static void main(String[] args) {
        //调用Person中的eat方法-->原始方式
        Person person = new Person();
        person.eat();


        //使用匿名对象方式去调用
        new Person().eat();

        System.out.println("-----------");

        // 匿名对象为属性赋值
        new Person().setName("金莲");
        new Person().setAge(36);

        //利用匿名对象调用get方法输出属性值
        String name = new Person().getName();
        int age = new Person().getAge();
        System.out.println(name+"..."+age);

    }
}
