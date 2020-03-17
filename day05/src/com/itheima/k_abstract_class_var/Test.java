package com.itheima.k_abstract_class_var;

/*
  测试类

    总结:
       1.定义抽象类,定义子类继承抽象类
       2.定义普通类,将抽象父类作为成员变量使用
       3.创建抽象父类的子类对象,将普通类的属性值去传递给普通类中的成员变量(抽象父类)

    作业:
       完成接口作为成员变量使用
 */
public class Test {
    public static void main(String[] args) {

        //创建Person对象
//        new Person("柳岩",传递Animal的对象);但是Animal是抽象类,不能直接new Animal,需要new子类

        Cat cat = new Cat();
        //cat.sleep();直接用cat调用重写的sleep
        Person person = new Person("柳岩", cat);
        System.out.println(person);
        person.method();//调用Person中的method

    }
}
