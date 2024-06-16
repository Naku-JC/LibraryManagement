package User;

import Operation.*;

import java.util.Scanner;

public class AdminUser extends User {
//    IOperation []operations;

    public AdminUser() {
        this.operations = new IOperation[]{
                //这里数组内的方法 序号 刚好与 选择业务的序号 对应上  妙啊
                //省去了 用 switch 一个一个的选择
                new exitSystem(),//0
                new SeekBook(),//1
                new addBook(),//2
                new removeBook(),//3
                new showBooks(),//4


        };

    }
    public int mune (){
        System.out.println();
        System.out.println("******管理员菜单******");
        System.out.println("* 1.查找图书        *");
        System.out.println("* 2.新增图书        *");
        System.out.println("* 3.删除图书        *");
        System.out.println("* 4.显示图书        *");
        System.out.println("* 0.退出系统        *");
        System.out.println("********************");
        System.out.println("请输入你的操作：");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }

}
