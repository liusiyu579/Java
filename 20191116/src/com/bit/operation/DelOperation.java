package com.bit.operation;

import com.bit.book.Book;
import com.bit.book.BookList;

import java.util.Scanner;

/**
 * @ClassName DelOperation
 * @Description TODO
 * @Author lenovo
 * @Date 2019/11/16 11:33
 * @Version 1.0
 **/
public class DelOperation implements Ioperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("DelOperation");
        System.out.println("输入需要删除书籍的名称");
        String name = scanner.next();
        int i = 0;
        //不会从bookList-》进行删除-》isBorrowed t是rue
        //1、找这本书 是否存在
        for (; i < bookList.getSize(); i++) {
            if (bookList.getBook(i).name.equals(name)) {
                break;
            }
        }
        if (i >= bookList.getSize()) {
            System.out.println("没找到此书");
            return;
        }
        for (int j = i; j < bookList.getSize()-1; j++) {
            Book book = bookList.getBook(j+1);
            bookList.setBooks(j,book);
        }
        bookList.setSize(bookList.getSize()-1);
    }
}
