package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService = (BookService) context.getBean("bookService");

        // Call both methods to verify constructor and setter injection
        bookService.addBook("Spring Patterns");
        bookService.addDefaultBook();

        ((ClassPathXmlApplicationContext) context).close();
    }
}
