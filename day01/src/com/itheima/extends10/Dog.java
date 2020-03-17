package com.itheima.extends10;

/*
  子类

     父类中的private,子类可以继承,但是访问不了
     父类中的构造方法,子类无法继承


     1.利用继承过来的public的get.set赋值
     2.利用子类中的构造方法
 */
public class Dog extends Animal {
    public Dog(){

    }

    public Dog(String name,int age){
        super(name,age);//调用的父类的有参构造
    }


    public void eat(){

        System.out.println("狗吃屎");
    }
    public void lookDoor(){

        System.out.println("看门");
    }
}
