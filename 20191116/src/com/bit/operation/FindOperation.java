package com.bit.operation;

import com.bit.book.BookList;

/**
 * @ClassName FindOperation
 * @Description TODO
 * @Author lenovo
 * @Date 2019/11/16 11:34
 * @Version 1.0
 **/
public class FindOperation implements Ioperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("FindOperation");
        System.out.println("输入需要借阅书籍的名称");
        String name = scanner.next();
        int i = 0;
        //不会从bookList-》进行删除-》isBorrowed true
        //1、找这本书 是否存在
        for (; i < bookList.getSize(); i++) {
            if(bookList.getBook(i).name.equals(name)) {
                System.out.println(bookList.getBook(i));
                break;
            }
        }
        if(i >= bookList.getSize()) {
            System.out.println("没找到此书");
            return;
        }
        System.out.println("找到此书");
    }
}
