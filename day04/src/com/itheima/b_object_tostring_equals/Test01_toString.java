package com.itheima.b_object_tostring_equals;
/*
   Object类中的toString方法
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    总结:
       1.如果直接输出对象名,没有重写Object类中的toString方法,默认调用了Object类中的toString
         输出的是地址值
       2.如果重写了toString方法,再输出地址值就没意义了,所以,我们重写toString之后应该输出的是属性值,内容


       小结:如果想让我们自己定义的类输出对应的对象名时,不出现地址值,那么该类需要重写toString方法,返回属性值

 */
public class Test01_toString {
    public static void main(String[] args) {
        Person p1 = new Person("柳岩", 36);
        System.out.println(p1);
        System.out.println(p1.toString());

        System.out.println("-------------------");
        String s = new String("abc");
        System.out.println(s);

    }
}
