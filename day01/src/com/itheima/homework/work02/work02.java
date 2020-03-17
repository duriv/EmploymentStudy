package com.itheima.homework.work02;
/*
二 编程题【继承】
2.1 题目：
	我们计划为一个电器销售公司制作一套系统，公司的主要业务是销售一些家用电器，例如：电冰箱、洗衣机、电视机产品。
	类的设计为：
	冰箱类
	属性：品牌、型号、颜色、售价、门款式、制冷方式
	洗衣机类
	属性：品牌、型号、颜色、售价、电机类型、洗涤容量
	电视类
	属性：品牌、型号、颜色、售价、屏幕尺寸、分辨率
2.2 要求：
	请根据上述类的设计，抽取父类“电器类”，并代码实现父类“电器类”、子类“冰箱类”，“洗衣机类”、“电视类”
 */
public class work02 {
     public static void main(String[] args) {
          //父类
//          DianQi dq = new DianQi();
//          dq.huhu("x","x","x",123);
          //电冰箱
          DianBingXiang dbx = new DianBingXiang();
          dbx.huhu("西门子","1.0","银色",999);
          dbx.bing("双开门","风冷");
          //洗衣机
          XiYiJi xyj = new XiYiJi();
          xyj.huhu("海尔","2.0","白色",1999);
          xyj.xi("滚筒","10L");
          //电视机
          DianShiJi dsj = new DianShiJi();
          dsj.huhu("TCL","3.0","黑色",2999);
          dsj.see("100","4k");
     }
}
class DianQi{
     private String Brand;
     private String Model;
     private String Color;
     private double Price;

     public DianQi(String brand, String model, String color, double price) {
          Brand = brand;
          Model = model;
          Color = color;
          Price = price;
     }

     public DianQi() {

     }

     //方法
     public void huhu(String brand, String model, String color, double price){
          System.out.println("品牌是："+brand+"型号"+model+"颜色"+color+"售价"+price);
     }
}
//冰箱类
class DianBingXiang extends DianQi{


     //方法
     public void huhu(String brand, String model, String color, double price){
          System.out.println("电冰箱品牌是："+brand+"型号"+model+"颜色"+color+"售价"+price);
     }
     private String Men;
     private String ZhiLeng;



     public DianBingXiang(String brand, String model, String color, double price, String men, String zhiLeng) {
          super(brand, model, color, price);
          Men = men;
          ZhiLeng = zhiLeng;
     }

     public DianBingXiang() {

     }

     //bing
     public void bing( String men, String zhiLeng){
          System.out.println("门款式"+men+"制冷方式"+zhiLeng);
     }
}
//洗衣机类
class XiYiJi extends DianQi{
     private String LeiXin;
     private String RongLiang;

     public XiYiJi(String brand, String model, String color, double price, String leiXin, String rongLiang) {
          super(brand, model, color, price);
          LeiXin = leiXin;
          RongLiang = rongLiang;
     }

     public XiYiJi(String leiXin, String rongLiang) {
          LeiXin = leiXin;
          RongLiang = rongLiang;
     }

     public XiYiJi() {

     }

     //方法
     public void huhu(String brand, String model, String color, double price){
          System.out.println("洗衣机品牌是："+brand+"型号"+model+"颜色"+color+"售价"+price);
     }
     //洗衣服
     public void xi( String leiXin, String rongLiang){
          System.out.println("电机类型"+leiXin+"洗涤容量"+rongLiang);
     }

}
//电视类
class DianShiJi extends  DianQi{
     private String ChiCun;
     private String FenBianLv;

     public DianShiJi(String brand, String model, String color, double price, String chiCun, String fenBianLv) {
          super(brand, model, color, price);
          ChiCun = chiCun;
          FenBianLv = fenBianLv;
     }

     public DianShiJi(String chiCun, String fenBianLv) {
          ChiCun = chiCun;
          FenBianLv = fenBianLv;
     }

     public DianShiJi(){}

     //方法
     public void huhu(String brand, String model, String color, double price){
          System.out.println("电视机品牌是："+brand+"型号"+model+"颜色"+color+"售价"+price);
     }
     //看电视
     public void see( String chiCun, String fenBianLv){
          System.out.println("尺寸是："+chiCun+"分辨率是："+fenBianLv);
     }
}