package com.itheima.abstract02;

public class Test {
    public static void main(String[] args) {
        //new子类对象,调用重写方法
        Dog dog = new Dog();
        dog.eat();

        Cat cat = new Cat();
        cat.eat();
    }
}
