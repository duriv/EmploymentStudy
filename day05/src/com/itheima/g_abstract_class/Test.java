package com.itheima.g_abstract_class;
/*
  抽象类作为方法的参数以及返回值
 */
public class Test {
    public static void main(String[] args) {
        //创建Person的子类对象
        Student student = new Student();
        method01_Var(student);

        System.out.println("======================");

        Person person = method02_Return();//Person person = student->多态
        person.eat();

        /*
          返回值类型毕竟是Person类型,如果想用子类接收返回值,那么需要向下转型
         */
        //Student student1 = (Student) method02_Return();

    }

    //抽象类作为方法的参数传递
    public static void method01_Var(Person person){//Person person = student多态
        person.eat();//调用的是子类重写的方法
    }

    //返回值类型为抽象类
    public static Person method02_Return(){
       //创建Person的子类对象
        Student student = new Student();
        return student;
    }
}
