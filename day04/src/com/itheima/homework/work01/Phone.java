package com.itheima.homework.work01;
/*
一 编程题【Object类】
1.1 题目一
	请按标准格式定义一个“手机类”，它有三个属性：品牌(String)、颜色(String)、价格(double)
 */
public class Phone {
    private String brand;
    private String color;
    private double price;

    public Phone() {
    }

    public Phone(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
