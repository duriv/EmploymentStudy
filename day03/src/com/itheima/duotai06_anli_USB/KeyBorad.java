package com.itheima.duotai06_anli_USB;
/*
  实现类
 */
public class KeyBorad implements Usb{
    @Override
    public void open() {
        System.out.println("键盘开启");
    }

    @Override
    public void close() {
        System.out.println("键盘关闭");
    }

    //特有方法
    public void input(){
        System.out.println("敲击我吧,快来敲击呀");
    }
}
