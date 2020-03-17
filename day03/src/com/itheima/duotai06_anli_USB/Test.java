package com.itheima.duotai06_anli_USB;
/*
   测试类
 */
public class Test {
    public static void main(String[] args) {
        //创建笔记本对象
        NoteBook noteBook = new NoteBook();
        //创建鼠标对象
        Mouse mouse = new Mouse();
        //创建键盘对象
        KeyBorad keyBorad = new KeyBorad();

        //调用NoteBook中的开机方法
        noteBook.start();
        //调用NoteBook中的使用usb设备的方法
        noteBook.useUsb(mouse);

        noteBook.useUsb(keyBorad);

        //调用NoteBook中的关机方法
        noteBook.stop();

    }
}
