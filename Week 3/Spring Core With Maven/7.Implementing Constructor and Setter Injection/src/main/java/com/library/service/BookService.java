package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;
    private String defaultBookName;

    // Constructor Injection
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Constructor Injection: BookRepository injected");
    }

    // Setter Injection
    public void setDefaultBookName(String defaultBookName) {
        this.defaultBookName = defaultBookName;
        System.out.println("Setter Injection: Default book name set to \"" + defaultBookName + "\"");
    }

    public void addBook(String name) {
        System.out.println("Adding book: " + name);
        bookRepository.saveBook(name);
    }

    public void addDefaultBook() {
        System.out.println("Adding default book: " + defaultBookName);
        bookRepository.saveBook(defaultBookName);
    }
}
