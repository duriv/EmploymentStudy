package com.itheima.interface07_notice02;

public class Zi extends Fu implements InterfaceA{
    @Override
    public void methodFu() {
        System.out.println("我是重写父类中的方法");
    }

    @Override
    public void methodA() {
        System.out.println("我是重写接口A中的方法");
    }

    @Override
    public void method(int i) {

    }
}
