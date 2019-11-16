package com.bit;

import com.bit.book.BookList;
import com.bit.user.Admin;
import com.bit.user.NormalUser;
import com.bit.user.User;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

/**
 * @ClassName Main
 * @Description TODO
 * @Author lenovo
 * @Date 2019/11/16 11:29
 * @Version 1.0
 **/
public class Main {
    public static User login(){
        System.out.println("请输入你的姓名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("请选择您的身份：");
        System.out.println("0.普通用户");
        System.out.println("1.管理员");
        int who = scanner.nextInt();
        if(who == 1) {
            return new Admin(name);
        }else {
            return new NormalUser(name);
        }
    }
    public static void main(String[] args) {
        BookList bookList = new BookList();
        User user = login();
        while(true) {
            int choice = user.menu();
            user.doOperation(choice,bookList);
        }
    }
}
