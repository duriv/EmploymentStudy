package com.itheima.abstract05;
//员工类
public abstract class YuanGong {
    private int id;
    private String name;

    public YuanGong() {
    }

    public YuanGong(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //抽象方法work
    public abstract void work();
}
