package com.itheima.f_class;
/*
  类作为方法的参数和返回值->地址值
 */
public class Test {
    public static void main(String[] args) {
        //创建Person对象,将对象传递到 method01_Var()方法中
        Person person1 = new Person();
        method01_Var(person1);

        System.out.println("----------------------");

        //调用方法
        Person person = method02_Return();
        person.eat();

    }

    //类作为方法的参数传递
    private static void method01_Var(Person person2) {
        person2.eat();
    }

    //类作为方法的返回值返回值
    public static Person method02_Return(){
        //创建Person对象
        Person person = new Person();
        return person;
    }
}
