package com.itheima.homework.work03;
/*
3.3 请问下面横线处分别填写什么代码，才能实现打印：
	class Outside{
		private int a = 100;
		class Inside{
			private int a = 200;
			public void show(){
				int a = 300;
				System.out.println(___________);//100
				System.out.println(___________);//200
				Ssytem.out.println(___________);//300
			}
		}
	}
 */
public class Outside01 {
    public static void main(String[] args) {
        Outside.Inside o =new Outside().new Inside();
            o.show();
    }
}
class Outside {
    private int a = 100;

    class Inside {
        private int a = 200;

        public void show() {
            int a = 300;
            //            System.out.println(___________);//100
            System.out.println(new Outside().a);//100
            //            System.out.println(___________);//200
            System.out.println(this.a);//200
            //            System.out.println(___________);//300
            System.out.println(a);//300
        }
    }
}