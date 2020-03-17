package com.itheima.homework.work03;
/*
3.5 请按要求填写代码：
	interface Animal{
		public void show();
	}
	class Test{
		public static void main(String[] args){
			fun(________________________);//请用子类的形式调用
			fun(________________________);//请用匿名内部类的形式调用
		}
		public static void fun(Animal a ){
			a.show();
		}
	}
 */
interface Animal{
    public void show();
}
class Test{
    public static void main(String[] args){
//        fun(________________________);//请用子类的形式调用
//        fun(________________________);//请用匿名内部类的形式调用
        Animal animal=new Cat();
        fun(animal);
        fun(new Animal() {
            @Override
            public void show() {
                System.out.println("匿名内部类调用。。。。");
            }
        });

    }
    static class Cat implements Animal{
        @Override
        public void show() {
            System.out.println("kkk");
        }
    }
    public static void fun(Animal a ){
        a.show();
    }
}