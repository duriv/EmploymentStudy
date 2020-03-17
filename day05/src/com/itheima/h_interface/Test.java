package com.itheima.h_interface;
/*
  接口作为方法的参数以及返回值
 */
public class Test {
    public static void main(String[] args) {
        //创建实现类对象
        Mouse mouse = new Mouse();
        method01_Var(mouse);

        System.out.println("--------使用匿名内部类当参数传递---------");

        method01_Var(new Usb() {
            @Override
            public void open() {
                System.out.println("键盘开启");
            }
        });
        System.out.println("-----------使用jdk新特性完成编码(今天不要记,装比而已)---------");
        method01_Var(()-> System.out.println("键盘开启11"));

        System.out.println("-------------------------------");

        Usb usb = method02_Return();//多态
        usb.open();
    }

    //接口作为方法的参数传递
    public static void method01_Var(Usb usb) {//多态
        usb.open();
    }

    //接口作为方法的返回值返回
    public static Usb method02_Return(){
        //创建实现类对象
        Mouse mouse = new Mouse();
        return mouse;
    }
}
