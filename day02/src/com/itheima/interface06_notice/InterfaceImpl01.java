package com.itheima.interface06_notice;

public class InterfaceImpl01 implements InterfaceA,InterfaceB{
    @Override
    public void methodA() {
        System.out.println("我是重写后的methodA");
    }

    @Override
    public void methodB() {
        System.out.println("我是重写后的methodB");
    }
}
