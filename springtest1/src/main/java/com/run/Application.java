package com.run;

import com.common.BookDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Application {

    public static void main(String[] args) {



        ApplicationContext context= new AnnotationConfigApplicationContext("com");
        String[] beanNames = context.getBeanDefinitionNames();

        for(String b : beanNames){
            System.out.println(b);
        }

        BookService bookService = context.getBean("serviceField",BookService.class);

        List<BookDTO> books = bookService.getAllBookList();
        for(BookDTO b : books){
            System.out.println(b);
        }
        BookDTO book = bookService.selectBookBySequence(1);

        System.out.println(book);
        System.out.println(bookService.averagePrice());

    }
}
