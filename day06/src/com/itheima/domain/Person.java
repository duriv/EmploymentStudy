package com.itheima.domain;

import com.itheima.utils.Utils;

/*
  抽象类
 */
public abstract class Person {
    private int id;//编号
    private String name;//姓名
    private String sex;//性别
    private String birthday;//出生日期
    private int age;//年龄--通过出生日期换算

    public Person() {
    }

    public Person(int id, String name, String sex, String birthday, int age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.age = age;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        //根据输入的出生年月日,自动计算出来的->在工具中有一个方法,自动根据输入的birthday计算出来的age
        //一会儿,我们直接调用工具类中的计算年龄的方法,获取此方法的返回回来的age
        return Utils.birthdayToAge(birthday);
    }

    public void setAge(int age) {
        this.age = age;
    }

    //便于直接查看对象中的属性值,通过toString方法

    @Override
    public String toString() {
        //this.getAge()->代表根据出生日期计算出来的age
        // getType()-> 子类重写之后返回的结果
        // getWork()->子类重写之后返回的结果
        return  id + "\t\t" +
                name + "\t\t" +
                sex + "\t\t" +
                birthday + "\t" +
                this.getAge() + "\t\t" +
                " 我是一名：" + getType() + " 我的工作是：" + getWork();
    }


    //定义两个抽象方法
    public abstract String getType();
    public abstract String getWork();
}
