package com.itheima.static03_notice;
/*
   static访问时的注意事项:

      1.静态的能直接访问非静态的吗?
         不能
        原因:静态的属于类成员,非静态的属于对象,优先于对象存在在内存中的
            所以,当静态的加载到内存的时候,对象还没有产生呢

        访问:new对象

      2.非静态的能直接访问静态的
         不同类:
            new对象
            类名直接调用
         同类:
            直接访问
            new对象
            类名直接调用
         访问:类名直接调用

      3.静态的能直接访问静态的

         同类
           直接调用
           new对象调用
           类名直接调用

         不同类
           new对象调用
           类名直接调用


      总结:
        只要是静态的访问非静态的->先new对象,再调用
        只要是访问静态的->类名直接调用


 */
public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.method();

        method01();
    }

    public void method(){
        System.out.println("我是非静态的method方法");
        Person person = new Person();
        person.drink();

        Person.drink();

        System.out.println("----------------");

        method01();
        Test.method01();//多此一举
    }

    public static void method01(){
        System.out.println("我是静态的method01方法");
    }
}
