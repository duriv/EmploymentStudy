package com.itheima.duotai04_good;
/*
   从方法参数的层面上说:

   原始方式:  类名 对象名 = new 类名()->等号左右两边是一样的
         好处:既可以调用重写的,还可以调用从父类继承过来的,还可以调用自己特有的方法
         坏处:扩展性差(代码量)

   多态方式:父类引用指向子类对象
         坏处:不能直接调用子类特有方法->多态的最大的缺点
         好处:扩展性真的强

         double b = 10;
         double b = 1.5;

 */
public class Test {
    public static void main(String[] args) {
          //利用多态的形式创建对象
        Animal animal = new Dog();
        animal.eat();

        animal = new Cat();
        animal.eat();

        System.out.println("-----------以下代码是体现多态的好处-------");

        Dog dog = new Dog();
        //调用method方法
        method(dog);

        Cat cat = new Cat();
        method(cat);

        DaXiang daXiang = new DaXiang();
        method(daXiang);

    }

    //定义一个方法,去调用重写的eat方法
    public static void method(Animal animal){//Animal animal = new Dog();Animal animal = new Cat()
        animal.eat();//调用重写的方法
    }
}
