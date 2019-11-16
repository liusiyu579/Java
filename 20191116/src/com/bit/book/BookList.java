package com.bit.book;

/**
 * @ClassName BookList
 * @Description TODO
 * @Author lenovo
 * @Date 2019/11/16 11:31
 * @Version 1.0
 **/
public class BookList {
    public Book[] books = new Book[10];
    public int size;//标记有效数据个数
    public BookList () {
        books[0] = new Book
                ("三国演义","罗贯中",15,"小说");
        books[1] = new Book
                ("西游记","吴承恩",10,"小说");
        books[2] = new Book
                ("水浒传","施耐庵",16,"小说");
        this.size = 3 ;
    }
    public void setBooks(int pos,Book book) {
        this.books[pos] = book;
    }
    public Book getBook(int pos) {
        return books[pos];
    }
        public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
}
