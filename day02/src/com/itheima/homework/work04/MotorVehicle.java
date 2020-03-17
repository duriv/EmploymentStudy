package com.itheima.homework.work04;
/*
4.1 题目
	一个机动车管理系统中有以下类的设计：
	机动车类：
		|--汽车类：
			|--奔驰车
			|--宝马车
		|--摩托车类：
			|--雅马哈摩托
			|--宝马摩托
	所有的车都有如下信息：
	属性：品牌、价格
	行为：运行
 */
public class MotorVehicle {
    private  String brand;
    private  String price;

    public MotorVehicle(String brand, String price) {
        this.brand = brand;
        this.price = price;
    }

    public MotorVehicle() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    //	行为：运行
    public void work(String brand){
        System.out.println(brand +"运行");
    }
}
