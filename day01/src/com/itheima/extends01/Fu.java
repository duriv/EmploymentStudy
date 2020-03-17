package com.itheima.extends01;
/*
   1.继承:子父类继承关系
   2.什么时候使用:
         当很多类中有共性的内容,我们就可以将共性的内容抽取出来,形成一个父类
         其他的类直接继承这个父类,就拥有(使用)了父类中非私有的成员(不是private的)
   3.作用:
         提高了代码的复用性,代码少了
   4.注意:
         子类继承父类之后,可以使用父类中非私有成员,但是不能直接访问父类中的private成员
         子类继承父类之后,可以拥有父类中的非私有成员,还可以拥有自己的特有成员
   5.怎么使用
         关键字  extends

         子类 extends 父类


 */
public class Fu {
    public void methodFu(){
        System.out.println("我是父类中的methodFu成员");
    }

    private void methodFu_Private(){
        System.out.println("我是父类中的私有成员");
    }
}
