package com.bit.operation;

import com.bit.book.BookList;

/**
 * @ClassName ReturnOperation
 * @Description TODO
 * @Author lenovo
 * @Date 2019/11/16 11:33
 * @Version 1.0
 **/
public class ReturnOperation implements Ioperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("ReturnOperation");
        System.out.println("输入需要归还书籍的名称");
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

        if(bookList.getBook(i).isBorrowed){
            bookList.getBook(i).isBorrowed = false;
            System.out.println("归还图书成功");
        }else {
            System.out.println("归还图书失败");
        }
    }
}
