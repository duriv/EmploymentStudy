package com.itheima.interface07_notice02;

public interface InterfaceF extends InterfaceD,InterfaceC{
    @Override
    default void method() {
        System.out.println("我是重写的父接口中D,C的默认方法");
    }
}
