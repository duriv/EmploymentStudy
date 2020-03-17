package com.itheima.duotai05_zhuanxing;
/*
   多态中的转型:向上转型  向下转型
     1.向上转型:默认->父类引用指向子类对象
             弊端:不能调用子类特有方法
     2.向下转型:
        double b = 10;
        int i = b;
        -->强转->  int i = (int)b

      父类 父类对象名 = new 子类()
      -->向下转型   子类 对象名 =(子类)父类对象名

     3.向下转型的问题
         Animal animal = new Dog();
         Cat cat = (Cat)animal;-->ClassCastException(类型转换异常)->等号左右两边类型不一致
     4.解决向下转型时出现的类型转换异常
        instanceof

        对象名 instanceof 类名  -->判断instanceof前面的对象是不是属于后面的类型

 */
public class Test {
    public static void main(String[] args) {
        //向上转型
        Animal animal = new Dog();
        //向下转型
        Dog dog = (Dog)animal;
        dog.lookDoor();

        System.out.println("------------以下代码是向下转型的问题说明---------");

       /* Animal animal1 = new Dog();
        Cat cat = (Cat)animal1;//出现问题,ClassCastExcption
        cat.catchMouse();*/

        System.out.println("------------以下代码是向下转型的问题的解决方案---------");

     /*   if (animal1 instanceof Dog){
            Dog dog1 = (Dog)animal1;
            //调用特有的方法
            dog1.lookDoor();
        }

        if (animal1 instanceof Cat){
            Cat cat1 = (Cat)animal1;
            cat1.catchMouse();
        }*/

        System.out.println("------------以下代码是instanceof在方法内的使用---------");

        Dog dog1 = new Dog();
        method(dog1);
        Cat cat1 = new Cat();
        method(cat1);
    }


    public static void method(Animal animal){
        if (animal instanceof Dog){
            Dog dog1 = (Dog)animal;
            dog1.lookDoor();//调用特有方法
        }

        if (animal instanceof Cat){
            Cat cat1 = (Cat)animal;
            cat1.catchMouse();
        }
    }


}
