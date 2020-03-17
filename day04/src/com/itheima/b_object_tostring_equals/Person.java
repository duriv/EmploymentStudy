package com.itheima.b_object_tostring_equals;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    /*
      问题1:参数为Object,传递的是Person,多态,不能调用子类特有的name
      解决1:向下转型

      问题2:
         如果调用重写的equals方法,参数传递的不是Person类型
         ClassCastException
      解决2:
         加判断  instanceof

      问题3:
         如果传递null,就不要直接判断instance
      解决3:
         加一个判断,如果是null,返回false

      问题4:如果调用equals方法参数传递的是同一个对象呢?
           自己跟自己没必要了

      解决4:
          为了比较效率加上判断代码
          if(this==obj){
             return true;
          }


    */

   /* @Override
    public boolean equals(Object obj) {//Object obj = p2
        if(this==obj){
            return true;
        }

        if (obj==null){
            return false;
        }

        if (obj instanceof Person){
            //向下转型
            Person p2 = (Person)obj;
            return this.name.equals(p2.name)&&this.age==p2.age;
        }

        return false;

    }
*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

   /*  @Override
    public String toString() {
        return name+","+age;
    }*/

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
