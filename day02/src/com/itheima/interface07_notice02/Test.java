package com.itheima.interface07_notice02;

/*
   注意事项(了解中的了解)
      1.一个类继承一个父类的同时实现一个或多个接口,要重写所有的抽象方法
      2.如果两个接口中有一毛一样的抽象方法,那么我们可以重写一个
      3.如果两个接口中有重名的默认方法,那么我们必须重写一个
      4.如果接口中有和父类的方法一样的默认方法,那么我们先执行父类的
      5.父接口中如果有重名的默认方法,那么子接口中要重写一次
 */
public class Test {
    public static void main(String[] args) {
        InterfaceImpl02 interfaceImpl02 = new InterfaceImpl02();
        interfaceImpl02.method();

        System.out.println("--------------------------");
        Zi01 zi01 = new Zi01();
        zi01.methodFu();
        zi01.methodDef();
    }
}
