package com.itheima.practise;

import java.util.ArrayList;
import java.util.Scanner;

/*
增删改查的操作
 */
public class Library {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList<Book> list = new ArrayList();
        //主体
        lo:
        while(true){
            System.out.println("**********欢迎进入图书管理系统**********");
            System.out.println("1 添加书籍");
            System.out.println("2 删除书籍");
            System.out.println("3 修改书籍");
            System.out.println("4 查看书籍");
            System.out.println("5 分类书籍");
            System.out.println("6 退出");
            //选择
            System.out.println("请输入你的选择：");
            int choose = sc.nextInt();
            //判断输入是否有误
            if (choose > 0 && choose < 7) {

                switch (choose) {
                    case 1:
//                        System.out.println("1 添加书籍");
                        addBook(list);
                        break;
                    case 2:
//                        System.out.println("2 删除书籍");
                        deleteBook(list);
                        break;
                    case 3:
//                        System.out.println("3 修改书籍");
                        updateBook(list);
                        break;
                    case 4:
//                        System.out.println("4 查看书籍");
                        findBook(list);
                        break;
                    case 5:
//                        System.out.println("5 分类书籍");
                        dortBook(list);
                        break;
                    case 6:
                        //                    System.out.println("退出");
                        System.out.println("感谢你的使用");
                        break lo;

                }
            } else {
                System.out.println("你的输入有误，请重试！！！谢谢。");
            }
        }
    }
//分类书籍
    private static void dortBook(ArrayList<Book> list) {
    }
//查看书籍
    private static void findBook(ArrayList<Book> list) {
        //直接展示所有书籍信息
        if(list.size()==0){
            System.out.println("图书管理系统中没有信息，空的");
            return;
        }
        System.out.println("编号\t名称\t作者\t类型\t数量");
        for(int i=0;i<list.size();i++){
            Book book =list.get(i);
            System.out.println(book.getId()+"\t\t"+book.getName()+"\t\t"+book.getAuteur()+"\t\t\t\t"+book.getType()+"\t\t\t\t"+book.getNumber());
        }
    }
//修改书籍
    private static void updateBook(ArrayList<Book> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想修改书籍的编号：");
        String id =sc.nextLine();
        //查找书籍位置a
        int index =getindex(id,list);
        if (index==-1){
            System.out.println("抱歉，我们没有此书");
        }else{
            //录入新的数据
            System.out.println("请输入新书籍的名称");
            String name = sc.nextLine();
            System.out.println("请输入新书籍的作者");
            String author = sc.nextLine();
            System.out.println("请输入新书籍的类型");
            String type = sc.nextLine();
            System.out.println("请输入新书籍的数量");
            String number = sc.nextLine();
            System.out.println("请输入存放书籍的新时间");
            String bookTime =sc.nextLine();

            Book book =new Book(id,name,author,type,number,bookTime);
            list.set(index,book);

            System.out.println("修改成功！！！");
        }
    }
//删除书籍
    private static void deleteBook(ArrayList<Book> list) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入你想要删除书籍的编号：");
        String a =sc.nextLine();
        //比较是否有此书籍，有则删除
        int b =getindex(a,list);
        if (b==-1){
            System.out.println("抱歉，我们没有此书");
        }else{
            list.remove(b);
            System.out.println("删除成功");
        }
    }

    //增加书籍
    private static void addBook(ArrayList<Book> list) {
        Scanner sc = new Scanner(System.in);
        String id;
        //id只能存在唯一值
        while (true) {
            System.out.println("请输入书籍的id");
            id = sc.nextLine();
            int index =getindex(id,list);
            if (index==-1){
                break;
            }else{
                System.out.println("你所添加的id已使用过，请更换id添加");
            }
        }
        //录入数据
        System.out.println("请输入书籍的名称");
        String name = sc.nextLine();
        System.out.println("请输入书籍的作者");
        String author = sc.nextLine();
        System.out.println("请输入书籍的类型");
        String type = sc.nextLine();
        System.out.println("请输入书籍的数量");
        String number = sc.nextLine();
        System.out.println("请输入存放书籍的时间");
        String bookTime =sc.nextLine();

        //放入集合
        Book book =new Book(id,name,author,type,number,bookTime);
        list.add(book);
        System.out.println("添加成功");

    }

    //比较是否有重复项出现
    public static int getindex(String id,ArrayList<Book> list){
        int index =-1;
        for(int i=0;i<list.size();i++){
            Book book=list.get(i);
            String b =book.getId();
            if(id.equals(b)){
                index =i;
                break;
            }
        }
        return index;
    }
}