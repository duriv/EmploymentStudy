package com.itheima.main;
import com.itheima.domain.Student;
import com.itheima.domain.Teacher;
import com.itheima.utils.Utils;
import java.util.ArrayList;
import java.util.Scanner;
/*
  启动类
 */
public class MainAPP {
    public static void main(String[] args) {
        //程序的入口
        //1.学生集合
        ArrayList<Student> stuList = new ArrayList<Student>();
        //2.教师集合
        ArrayList<Teacher> teaList = new ArrayList<Teacher>();

        //3.创建Scanner对象,用于录入
        Scanner sc = new Scanner(System.in);

        //4.死循环,直到用户输入"退出"为止
        while (true) {
            //a.打印以及菜单
            System.out.println("1.学生管理系统          2.教师管理系统         3.退出");
            //b.键盘录入,选择进入的系统
            String user = sc.next();
            //c.判断->根据输入的编号,决定进入哪个系统
            if (user.equals("1")) {
                //进入学生管理系统
                studentManager(stuList);//上来就要展示学生管理系统的二级菜单
            } else if (user.equals("2")) {
                //进入教师管理系统->自己写
                teacherManager(teaList);//上来就要展示教师管理系统的二级菜单
            } else if (user.equals("3")) {
                //退出系统
                exitSystem();
            } else {
                System.out.println("输入有误!");
            }
        }

    }
    //学生管理系统
    private static void studentManager(ArrayList<Student> stuList) {
        //1.创建Scanner对象,用于键盘录入
        Scanner sc = new Scanner(System.in);
        //2.用户选择的是学生管理系统
        //3.展示二级菜单
        while (true) {
            System.out.println("1.添加学员     2.修改学员     3.删除学员     4.查询学员     5.返回上一级菜单");
            //a.录入,选择对应的功能
            String select = sc.next();
            //b.判断,用户选择的是哪一个功能
            switch (select) {
                case "1":
                    // System.out.println("[添加成功!]");
                    addStudent(stuList);
                    break;
                case "2":
                    //System.out.println("[修改成功!]");
                    updateStudent(stuList);
                    break;
                case "3":
                    //System.out.println("[删除成功!]");
                    deleteStudent(stuList);
                    break;
                case "4":
                    //System.out.println("[查询成功!]");
                    findStudent(stuList);
                    break;
                case "5":
                    System.out.println("返回上一级!");
                    System.out.println("*******************************************");
                    return;
                default:
                    System.out.println("[输入有误!]");
                    break;
            }
        }

    }
    //修改学生
    private static void updateStudent(ArrayList<Student> stuList) {
        //1.创建Scanner对象,输入要修改的内容
        Scanner sc = new Scanner(System.in);
        //2.给提示,提示[请输入您要修改的学生id]
        System.out.println("请输入您要修改的学生ID:");
        int updateID = sc.nextInt();
        //3.遍历集合,将集合中的学生遍历出来,判断要修改的学生在不在集合中
        for (int i = 0; i < stuList.size(); i++) {
            //a.取出学生
            Student student = stuList.get(i);
            //b.判断集合中的学生id是否和我们要修改的id相等,如果相等,修改
            if (updateID==student.getId()){
                //c.打印要修改的学生->展示单个的学生
                System.out.println("您要修改的学生信息如下:");
                Utils.printPerson(student);
                //d.修改姓名,性别,生日
                System.out.println("请你输入修改后的名字(不修改输入0):");
                String newName = sc.next();

                System.out.println("请你输入修改后的性别(不修改输入0):");
                String newSex = sc.next();

                System.out.println("请您输入修改后的生日(不修改输入0):");
                String newBirthday = sc.next();

                //e.判断如果三个属性输入的是0,则不修改,否则修改->单独去调用set方法去修改属性值
                if (!("0".equals(newName))){
                    student.setName(newName);
                }

                if (!("0".equals(newSex))){
                    student.setSex(newSex);
                }

                if (!("0".equals(newBirthday))){
                    student.setBirthday(newBirthday);
                }

                //显示修改成功
                System.out.println("[修改成功!]");
                return;
            }
        }

        //提示
        System.out.println("[修改学生的ID]"+updateID+"不存在!");
    }
    //删除功能
    private static void deleteStudent(ArrayList<Student> stuList) {
        //1.创建Scanner对象
        Scanner sc = new Scanner(System.in);
        //2.给提示,提示[请输入您要删除的学生id]
        System.out.println("请输入您要删除的学生ID:");
        int deleteID = sc.nextInt();
        //3.遍历集合中的学生对象,判断集合中有没有我们要删除的学生,比较的是id
        for (int i = 0; i < stuList.size(); i++) {  //1   2
            Student student = stuList.get(i);
            //a.比较遍历出来的学生id是否和我们输入的学生id相等
            if (deleteID == student.getId()) {
                //b.显示一个这个学生的信息
                System.out.println("您要删除的学生信息如下:");
                //c.调用工具类中的展示一个学生信息的方法
                Utils.printPerson(student);
                //d.显示是否删除确认信息
                System.out.println("您确定要删除上面这个学生吗?(y/n)");
                //e.输入y还是n
                String delete = sc.next();
                switch (delete) {
                    case "y":
                        stuList.remove(student);
                        System.out.println("[删除成功!]");
                        break;
                    case "n":
                        System.out.println("[取消删除!]");
                        break;
                    default:
                        System.out.println("[输入有误!删除已经取消,您安息吧!]");
                        break;
                }

                //结束方法
                return;
            }

        }

        System.out.println("[输入学生ID]"+deleteID+"有误!");

    }
    //查看学生信息
    private static void findStudent(ArrayList<Student> stuList) {
        //先判断一下,stuList有没有元素
        if (stuList.size() == 0) {
            System.out.println("[系统中暂无学生信息,添加后再查看!]");
            //结束查看方法,返回二级菜单,需要先添加学生,再看
            return;
        }

        //使用工具类中的方法 printPersonList
        Utils.printPersonList(stuList);

    }
    //添加学生功能
    private static void addStudent(ArrayList<Student> stuList) {
        //1.创建Scanner对象用于输入学生的属性值
        Scanner sc = new Scanner(System.in);
        System.out.println("您选择了添加学生功能!");
        //2.调用next方法输入添加学生的具体信息
        System.out.println("请您输入新学生的姓名:");
        String name = sc.next();
        System.out.println("请您输入新学生的性别:");
        String sex = sc.next();
        System.out.println("请你输入新学生的出生年月日(yyyy-MM-dd):");
        String birthday = sc.next();
        //3.将输入的值赋值到Student对象中
        Student student = new Student(++(Utils.stuId), name, sex, birthday, 0);
        stuList.add(student);
        //提示
        System.out.println("添加成功!");
    }
    //教师管理系统(作业)
    private static void teacherManager(ArrayList<Teacher> teaList) {
        //用户选择的是教师管理系统
//        System.out.println("[教师管理系统正在开发中,敬请期待...]");
        //1.常见Scanner对象，用于键盘录入
        Scanner sc= new Scanner(System.in);
        //选择的教师管理系统
        //展示二级菜单
        while (true){
            System.out.println("1.添加教师    2.修改教师     3.删除教师     4.查询教师     5.返回上一级菜单");
            String a =sc.next();
            //判断选择功能
            switch (a){
                case "1":
//                    System.out.println("添加成功");
                    addTeacher(teaList);
                    break;
                case "2":
//                    System.out.println("修改成功");
                    updateTeacher(teaList);
                    break;
                case "3":
//                    System.out.println("删除教师");
                    deleteTeacher(teaList);
                    break;
                case "4":
//                    System.out.println("查询教师");
                    findTeacher(teaList);
                    break;
                case "5":
//                    System.out.println("返回上一级菜单");
                    returnUp();
                    break;
                default:
                    System.out.println("你输入的的有问题，请重新输入：");
                    break;
            }
        }

    }
    //添加教师
    private static void addTeacher(ArrayList<Teacher> teaList) {
        //直接添
        Scanner sc = new Scanner(System.in);
        System.out.println("这里是添加页面");
        System.out.println("请输入教师姓名");
        String name = sc.next();
        System.out.println("请输入教师性别");
        String sex = sc.next();
        System.out.println("请输入教师出生日期：(yyyy-MM-dd)");
        String birthday = sc.next();

        //存入
        Teacher tea = new Teacher(++Utils.stuId, name, sex, birthday, 0);
        teaList.add(tea);
        System.out.println("信息存入成功");
    }
    //修改数据
    private static void updateTeacher(ArrayList<Teacher> teaList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想修改学生的id");
        int c = sc.nextInt();
        //遍历寻找匹配

        for (int i = 0; i < teaList.size(); i++) {
            Teacher teacher = teaList.get(i);
            if (c==teacher.getId()){
                System.out.println("这是你想要修改的教师信息：");
                //呃：调用方法展示
                Utils.printPerson(teacher);
                //修改开始
                System.out.println("请输入新的名字(不修改输入666)");
                String newName = sc.next();
                System.out.println("请输入新的性别(不修改输入666)");
                String newSex = sc.next();
                System.out.println("请输入新的生日(不修改输入666)");
                String newBirthday = sc.next();

                //判断是否修改
                if (!("666".equals(newName))){
                    teacher.setName(newName);
                }
                if (!("666".equals(newSex))){
                    teacher.setName(newSex);
                }
                if (!("666".equals(newBirthday))){
                    teacher.setName(newBirthday);
                }

                System.out.println("修改成功、");
                return;
            }
        }
    }
    //根据id删除想删除的教师
    private static void deleteTeacher(ArrayList<Teacher> teaList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想删除学生的id：");
        int teaId=sc.nextInt();
        //遍历比较是否相等并处理
        for (int i = 0; i < teaList.size(); i++) {
            Teacher tea = teaList.get(i);
            if (teaId==tea.getId()){
                System.out.println("这是你想删除的学生吗？" );
                //呃，调用工具类中的展示一个学生信息的方法
                Utils.printPerson(tea);
                //确认选项
                System.out.println("你确定要删除上面这个教师吗？(y/n)");
                String b = sc.next();
                switch (b){
                    case "y":
                        teaList.remove(tea);//teaid呢？
                        System.out.println("删除成功！！！");
                        break;
                    case "n":
                        System.out.println("取消删除了、、");
                        break;
                    default:
                        System.out.println("你的输入有误");
                        break;
                }
                return;
            }
        }
    }
    //查看教师信息
    private static void findTeacher(ArrayList<Teacher> teaList) {
        if (teaList.size()==0){
            System.out.println("教师系统中暂时没有信息，请添加后查询");
            return;
        }
        //呃，使用工具方法
        Utils.printPersonList(teaList);
    }
    //教师返回上一级
    private static void returnUp() {
        System.out.println("***********返回上一级************");
        return;
    }
    //退出系统
    private static void exitSystem() {
        //用户选择的是3   退出管理系统
        System.out.println("[欢迎下次光临,886~]");
        //让用户退出系统
        System.exit(0);
    }
}
