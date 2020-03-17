package com.itheima.extends05;
/*
   重载:在一个类中,方法名相同,参数列表不同

   子类中有一个和父类一样的方法->重写方法
   前提:必须有子父类继承关系(接口实现关系)
   注解:@Override->检验此方法是否为重写的方法

   注意事项:
      1. 子类方法覆盖(重写)父类方法，必须要保证权限大于等于父类权限。(权限修饰符)
            public -> protected ->默认(default)->private
      2. 子类方法重写父类方法，返回值类型、函数名和参数列表都要一模一样。
      3. 私有方法不能被重写(子类都访问不到)

      总结:方法的重写->子类的方法和父类的方法要一致(方法的声明)

      使用场景:
        当子类想要对父类中的方法进行功能的增强
 */
public class Zi extends Fu {
    public void methodZi(){
        System.out.println("我是子类中的methodZi方法");
    }


    @Override
    public void method(){
        System.out.println("我是子类中的method方法");
    }
}
