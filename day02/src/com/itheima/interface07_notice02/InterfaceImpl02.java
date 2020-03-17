package com.itheima.interface07_notice02;

public class InterfaceImpl02 implements InterfaceC,InterfaceD{
    @Override
    public void method() {
        System.out.println("我是重写的默认方法");
    }
}
