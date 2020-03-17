package com.itheima.in_class_niming;
/*
    里面有定义一个eat抽象方法

    如果我们先想调用eat方法,由于eat方法是抽象的
    所以,我们不得不定义一个子类,重写eat方法
    创建子类对象,调用eat方法

    1.创建子类
    2.继承父类
    3.重写抽象方法
    4.创建子类对象,调用重写的方法

    匿名内部类:4合1
       格式:
          new 父类/接口(){
              重写父类或者接口中的方法
          }.重写的方法

       注意:
          new 父类/接口->代表的是子类对象/实现类对象


       格式2:
         父类/接口名  对象名 = new 父类/接口(){
              重写父类或者接口中的方法
          }

          对象名.重写的方法()

 */
public abstract class Person {
    public abstract void eat();
}
