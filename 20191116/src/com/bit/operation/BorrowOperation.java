package com.bit.operation;

import com.bit.book.Book;
import com.bit.book.BookList;

/**
 * @ClassName BorrowOperation
 * @Description TODO
 * @Author lenovo
 * @Date 2019/11/16 11:32
 * @Version 1.0
 **/
public class BorrowOperation implements Ioperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("BorrowOperation");
        System.out.println("输入需要借阅书籍的名称");
        String name = scanner.next();
        int i = 0;
        //不会从bookList-》进行删除-》isBorrowed true
        //1、找这本书 是否存在
        for (; i < bookList.getSize(); i++) {
            if(bookList.getBook(i).name.equals(name)) {
                break;
            }
        }
        if(i >= bookList.getSize()) {
            System.out.println("没找到此书");
            return;
        }
        //2、他是否被借出   false  可以借
        if(bookList.getBook(i).isBorrowed){
            System.out.println("书被借走了");
        }else {
            bookList.getBook(i).isBorrowed = true;
        }
        System.out.println("借阅图书成功");
    }
}
