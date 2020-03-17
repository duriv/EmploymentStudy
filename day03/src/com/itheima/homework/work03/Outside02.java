package com.itheima.homework.work03;
/*
3.4 请问下面横线处分别填写什么代码，才能实现打印：
	class Outside{
		public void show(){
			__________
			class Inside{
				public void show(){
					System.out.println(“a = “ + a);//10
				}
			}
		}
	}
 */
public class Outside02 {
    public static void main(String[] args) {
        Outside1 o =new Outside1();
        o.show();

    }
}
class Outside1{
    public void show(){
//        __________
         int a =10;
        class Inside1{
            public void show(){
                System.out.println("a="+ a);//10
            }
        }new Inside1().show();
    }
}