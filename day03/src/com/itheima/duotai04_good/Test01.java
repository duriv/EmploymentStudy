package com.itheima.duotai04_good;
/*
   从方法参数的层面上说:

   原始方式:  类名 对象名 = new 类名()->等号左右两边是一样的
         好处:既可以调用重写的,还可以调用从父类继承过来的,还可以调用自己特有的方法
         坏处:扩展性差(代码量)

   多态方式:父类引用指向子类对象
         坏处:不能直接调用子类特有方法->多态的最大的缺点
         好处:扩展性真的强

 */
public class Test01 {
    public static void main(String[] args) {
        //利用多态的形式创建对象
        Animal animal = new Dog();
        animal.eat();
        //animal.lookDoor();  多态的形式不能直接调用子类特有方法

        //原始方式new对象
        Dog dog = new Dog();
        dog.eat();
        dog.lookDoor();

        System.out.println("-----------以下是原始方式new对象的坏处-----------");

        Dog dog1 = new Dog();
        //dog1 = new Cat();
        //调用方法,传递dog1
        method(dog1);

        Cat cat = new Cat();
        //method(cat);method方法只能传递dog对象,不能传递mao对象
        method01(cat);
    }

    //定义一个方法,调用子类重写的方法-->演示原始方式坏处的方法
    public static void method(Dog dog){
        //调用main方法中new的狗对象中重写的方法
        dog.eat();
    }

    //定义一个调用cat中重写eat方法的method01方法-->演示原始方式坏处的方法
    public static void method01(Cat cat){
        cat.eat();
    }


}
