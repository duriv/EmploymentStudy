package com.itheima.homework.work03;
/*
3.1 题目
1.	请定义“员工(类)”：
	属性：姓名、性别、年龄(全部私有)
	行为：工作(抽象)
	无参、全参构造方法
	get/set方法
 */
public class Staff {
    //	属性：姓名、性别、年龄(全部私有)
    private String age;
    private String name;
    private String sex;
    //	无参、全参构造方法
    //	get/set方法
    public Staff() {
    }

    public Staff(String age, String name, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
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
    //	行为：工作(抽象)
    public void work(String name,String age , String sex){
        System.out.println("姓名"+name+"年龄"+age+"性别"+sex+"努力工作");
    }
}
