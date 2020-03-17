package com.itheima.i_class_var;
/*
  为了让人和身份证产生关系,可以在Person中定义身份证对象
 */
public class Person {
    private String name;
    //普通类作为成员变量
    private IDCard idCard;

    public Person() {
    }

    public Person(String name, IDCard idCard) {
        this.name = name;
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IDCard getIdCard() {
        return idCard;
    }

    public void setIdCard(IDCard idCard) {
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", idCard=" + idCard +
                '}';
    }
}
