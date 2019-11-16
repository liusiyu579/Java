package com.bit.book;

/**
 * @ClassName Book
 * @Description TODO
 * @Author lenovo
 * @Date 2019/11/16 11:31
 * @Version 1.0
 **/
public class Book {
    public String name;
    public String author;
    public int price;
    public String type;//小说
    public boolean isBorrowed;//是否被借出

    public Book(String name, String author, int price,
                String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ( (isBorrowed == true) ? ",已借出" : ",未借出"  )+
                '}';
    }
}
