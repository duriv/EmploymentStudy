package com.itheima.h_interface;

public class Mouse implements Usb{
    @Override
    public void open() {
        System.out.println("鼠标开启");
    }
}
