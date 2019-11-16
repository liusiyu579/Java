package com.bit.operation;

import com.bit.book.BookList;

/**
 * @ClassName ExitOperation
 * @Description TODO
 * @Author lenovo
 * @Date 2019/11/16 11:33
 * @Version 1.0
 **/
public class ExitOperation implements Ioperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("ExitOperation");
        System.exit(0);
    }
}
