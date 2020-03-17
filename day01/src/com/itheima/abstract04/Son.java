package com.itheima.abstract04;
/*
   抽象类中，可以有构造方法，是供子类创建对象时，初始化父类成员使用的。
 */
public class Son extends Person{

    public Son(){

    }
    public Son(String name){
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("儿子喜欢吃肉");
    }
}
