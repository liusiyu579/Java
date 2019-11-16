package com.bit.operation;

import com.bit.book.Book;
import com.bit.book.BookList;

import java.util.Scanner;

/**
 * @ClassName AddOperation
 * @Description TODO
 * @Author lenovo
 * @Date 2019/11/16 11:32
 * @Version 1.0
 **/
public class AddOperation implements Ioperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("添加书籍");
        System.out.println("请输入图书的名字：");
        String name = scanner.next();
        System.out.println("请输入图书的作者");
        String author = scanner.next();
        System.out.println("请输入图书的价格");
        int price = scanner.nextInt();
        System.out.println("请输入图书的类型");
        String type = scanner.next();
        Book book = new Book(name,author,price,type);
        //没有考虑满的情况
        bookList.setBooks(bookList.getSize(),book);
        bookList.setSize(bookList.getSize()+1);
        System.out.println("添加成功！");
    }
}

