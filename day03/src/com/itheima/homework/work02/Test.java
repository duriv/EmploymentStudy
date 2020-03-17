package com.itheima.homework.work02;
/*
二 编程题【多态】
2.1 题目
	有以下类定义：
	动物类：
	属性：名称、年龄、性别
	行为：吃饭(非抽象)
	猫类继承自动物
	行为：捉老鼠
2.2 要求
	请按要求在代码中定义上述类，并用多态的形式测试调用“吃饭”和“捉老鼠”的方法，看看有什么特点？
 */
public class Test {
    public static void main(String[] args) {
/*        Animal animal1=new Animal();
        animal1.setName("霸王");
        animal1.setAge(18);
        animal1.setSex("男");
        System.out.println(animal1.getName()+animal1.getAge()+animal1.getSex());*/
//        多态的形式测试调用“吃饭”和“捉老鼠”的方法
//        多态：父类引用指向子类对象
        Animal animal=new Cat();
        animal.eat();

        //向下
        Cat c =(Cat)animal;
        c.run("猫");

    }
}
