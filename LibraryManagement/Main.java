import Operation.IOperation;
import Operation.exitSystem;
import User.AdminUser;
import User.NormalUser;

import java.awt.print.Book;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Booklist booklist = new Booklist();

            login(booklist);

    }

    private static void login(Booklist booklist){
        System.out.println("您好~欢迎使用该图书管理系统~~");
        System.out.println("=====请输入身份进入系统：====");
        System.out.println(" 1、管理员     2、普通用户");
        System.out.println("=========================");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        switch (choice){
            case "1":
                AdminUser adminUser = new AdminUser();
                while (true) {
                    int choice2 = adminUser.mune();
                    adminUser.doOperation(choice2,booklist.getList());
                    booklist.updateInformation();
                }
            case "2":
                while (true) {
                    NormalUser normalUser = new NormalUser();
                    int choice3 = normalUser.mune();
                    normalUser.doOperation(choice3,booklist.getList());
                    booklist.updateInformation();
                }
        }
    }
}
