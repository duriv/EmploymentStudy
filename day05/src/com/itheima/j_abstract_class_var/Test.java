package com.itheima.j_abstract_class_var;
/*
  测试类
 */
public class Test {
    public static void main(String[] args) {

        //创建Person对象
//        new Person("柳岩",传递Animal的对象);但是Animal是抽象类,不能直接new Animal,需要new子类

        Cat cat = new Cat();
        Person person = new Person("柳岩", cat);
        System.out.println(person);
    }
}
