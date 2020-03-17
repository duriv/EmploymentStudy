package com.itheima.extends04;
/*
   在继承中,成员方法的访问特点:

      不重名:  如果new的是父类,只能调用父类的
              如果new的是子类,既能调用子类的,还能调用父类的(非私有)


      重名:
              看new的是谁,先调用谁的,如果子类没有,找父类


      总结:子类有的先调用子类的,子类没有找父类->子债父偿

      所有的类都会直接或者间接的继承一个类->Object->所有类的父类(祖宗类)
      如果一个类明确写出了extends 父类,此类就明确了父类
      如果一个类没有明确写出extends 父类,他的爹就是Object
 */
public class Test{
    public static void main(String[] args) {
      //创建子类对象
        Zi zi = new Zi();
        zi.methodZi();
        zi.method();

        System.out.println("------------------");
        //创建父类对象
        Fu fu = new Fu();
        fu.method();
    }
}
