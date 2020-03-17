package com.itheima.practise;
/*
定义图书管理系统的一些属性
 */
public class Book {
    //图书编号
    private String id;
    //图书名称
    private String name;
    //图书作者
    private String auteur;
    //图书类型
    private String type;
    //图书数量
    private String number;
    //图书添加时间
    private String bookTime;

    //构造方法/get，set

    public Book() {
    }

    public Book(String id, String name, String auteur, String type, String number, String bookTime) {
        this.id = id;
        this.name = name;
        this.auteur = auteur;
        this.type = type;
        this.number = number;
        this.bookTime = bookTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBookTime() {
        return bookTime;
    }

    public void setBookTime(String bookTime) {
        this.bookTime = bookTime;
    }
}
