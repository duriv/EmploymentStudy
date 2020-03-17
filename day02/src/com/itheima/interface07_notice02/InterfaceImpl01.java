package com.itheima.interface07_notice02;

public class InterfaceImpl01 implements InterfaceA,InterfaceB{

    @Override
    public void methodA() {
        System.out.println("我是重写接口A中的方法");
    }

    @Override
    public void method(int i) {

    }

    @Override
    public void methodB() {
        System.out.println("我是重写接口B中的方法");
    }

    @Override
    public void method() {
        System.out.println("我是重写接口A,B中的方法");
    }
}
