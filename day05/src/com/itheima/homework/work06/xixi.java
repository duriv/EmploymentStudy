package com.itheima.homework.work06;

public class xixi {
    private String name;
    private  int age;
    private Persion persion;

    public xixi() {
    }

    public xixi(String name, int age, Persion persion) {
        this.name = name;
        this.age = age;
        this.persion = persion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Persion getPersion() {
        return persion;
    }

    public void setPersion(Persion persion) {
        this.persion = persion;
    }

    @Override
    public String toString() {
        return "xixi{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", persion=" + persion +
                '}';
    }
}
