package com.itheima.duotai06_anli_USB;
/*
   实现类
 */
public class Mouse implements Usb{
    @Override
    public void open() {
        System.out.println("鼠标开启");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭");
    }

    //定义特有方法
    public void click(){
        System.out.println("点我,快点我啊!");
    }
}
