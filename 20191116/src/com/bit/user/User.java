package com.bit.user;

import com.bit.book.BookList;
import com.bit.operation.Ioperation;

/**
 * @ClassName User
 * @Description TODO
 * @Author lenovo
 * @Date 2019/11/16 11:34
 * @Version 1.0
 **/
public abstract class User {
    public String name;
    protected Ioperation[] ioperations;

    public abstract int menu();
    public void doOperation(int choice, BookList bookList) {
        ioperations[choice].work(bookList);
    }
}
