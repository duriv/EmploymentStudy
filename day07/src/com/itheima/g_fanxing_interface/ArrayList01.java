package com.itheima.g_fanxing_interface;

public class ArrayList01<E> implements Demo02FanXing<E>{
    @Override
    public void add(E e) {
        System.out.println(e);
    }
}
