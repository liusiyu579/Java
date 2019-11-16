package com.bit.operation;

import com.bit.book.BookList;

import java.util.Scanner;

public interface Ioperation {
    Scanner scanner = new Scanner(System.in);
    void work(BookList bookList);
}
