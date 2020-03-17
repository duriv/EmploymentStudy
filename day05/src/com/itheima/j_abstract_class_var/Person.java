package com.itheima.j_abstract_class_var;
/*
  人要养动物,为了表示人和动物的关系,在Person类中定义Animal,作为成员变量
 */
public class Person {
    private String name;
    private Animal animal;

    public Person() {
    }

    public Person(String name, Animal animal) {
        this.name = name;
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", animal=" + animal +
                '}';
    }
}
