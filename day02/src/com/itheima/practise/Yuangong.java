package com.itheima.practise;
//员工类
public abstract class Yuangong{
    private String name;
    private String xingbei;
    private int age;
    //无参构造
    public Yuangong(){}
   //有参数构造
    public Yuangong(String name, String xingbei, int age) {
        this.name = name;
        this.xingbei = xingbei;
        this.age = age;
    }
        ///get/set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getXingbei() {
        return xingbei;
    }

    public void setXingbei(String xingbei) {
        this.xingbei = xingbei;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //抽象类工作
    public abstract void work();
}
