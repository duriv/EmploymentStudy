package com.itheima.in_class_niming;
/*
   使用场景:
     如果抽象方法就简单的调用,我们无需为了实现这个抽象方法,自己单独再去定义类
     重写方法,创建子类对象,调用方法

     直接使用匿名内部类就可以了

 */
public class Test {
    public static void main(String[] args) {
        //创建子类对象
        Son son = new Son();
        son.eat();

        System.out.println("-------以下代码是匿名内部类写法--------");

        new Person(){
            @Override
            public void eat() {
                System.out.println("人要吃饭");
            }
        }.eat();

        System.out.println("----------------------");

        /*
           格式2:
         父类/接口名  对象名 = new 父类/接口(){
              重写父类或者接口中的方法
          }

          对象名.重写的方法()

         */

        Person person = new Person() {
            @Override
            public void eat() {
                System.out.println("人要吃臭豆腐");
            }
        };
        person.eat();
    }
}
