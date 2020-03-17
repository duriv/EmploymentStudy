package com.itheima.duotai01_use;

public class Test {
    public static void main(String[] args) {
        //利用多态的形式创建对象->父类引用指向子类对象(父类 对象名 = new 子类())
        Animal animal = new Dog();
        //调用的是子类重写的方法
        animal.eat();

        //animal.lookDoor();不好使,多态形式new对象,不能调用子类特有方法

        Dog dog = new Dog();
        dog.eat();
        dog.lookDoor();

    }
}
