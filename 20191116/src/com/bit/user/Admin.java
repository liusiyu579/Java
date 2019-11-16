package com.bit.user;

import com.bit.operation.*;

import java.util.Scanner;

/**
 * @ClassName Admin
 * @Description TODO
 * @Author lenovo
 * @Date 2019/11/16 11:30
 * @Version 1.0
 **/
public class Admin extends User{
    public Admin(String name){
        this.name = name;
        this.ioperations = new Ioperation[]{
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation()
        };
    }
    @Override
    public int menu() {
        System.out.println("hello"+this.name+" 欢迎使用图书管理系统");
        System.out.println("==================================");
        System.out.println("==========1.查找图书===============");
        System.out.println("==========2.增添图书===============");
        System.out.println("==========3.删除图书===============");
        System.out.println("==========4.打印图书===============");
        System.out.println("==========0.退出系统===============");
        System.out.println("====================================");
        Scanner scanner = new Scanner(System.in);
        int choise = scanner.nextInt();
        return choise;
    }
}
