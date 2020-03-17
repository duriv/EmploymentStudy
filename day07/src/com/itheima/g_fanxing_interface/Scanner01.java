package com.itheima.g_fanxing_interface;

public class Scanner01 implements Demo02FanXing<String>{
    @Override
    public void add(String s) {
        System.out.println(s);
    }
}
