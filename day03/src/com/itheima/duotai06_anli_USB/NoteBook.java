package com.itheima.duotai06_anli_USB;

public class NoteBook {
    //定义开机功能
    public void start(){
        System.out.println("我要开机了!");
    }

    //定义关机功能
    public void stop(){
        System.out.println("我要关机了!");
    }

    /*
       使用USB设备功能的方法
       后面我们调用此方法,给这个方法传递具体的设备
       需要让此方法,实现传递的设备开启和关闭的功能
     */

    public void useUsb(Usb usb){//Usb usb = mouse   Usb usb = keyBorad
        //价格判断
        if (usb instanceof Mouse){
            usb.open();
            usb.close();
            //向下转型,调用特有方法
            Mouse mouse = (Mouse)usb;
            mouse.click();
        }

        if (usb instanceof KeyBorad){
            usb.open();
            usb.close();
            //向下转型,调用特有方法
            KeyBorad keyBorad = (KeyBorad)usb;
            keyBorad.input();
        }

    }
}
