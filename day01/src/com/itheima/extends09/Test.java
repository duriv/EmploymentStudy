package com.itheima.extends09;
/*
  通过访问父类的get.set为父类中的私有属性赋值
 */
public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("狗剩");
        dog.setAge(2);

        System.out.println(dog.getName()+"..."+dog.getAge());
    }
}
