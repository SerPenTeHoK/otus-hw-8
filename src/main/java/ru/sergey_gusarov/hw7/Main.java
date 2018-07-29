package ru.sergey_gusarov.hw7;

import org.h2.tools.Console;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.sergey_gusarov.hw7.dao.books.BookRepository;
import ru.sergey_gusarov.hw7.domain.books.Book;

import java.util.List;

@SpringBootApplication
public class Main {

    public static void main(String[] args) throws Exception {

        ApplicationContext context = SpringApplication.run(Main.class);

        BookRepository BookRepository = context.getBean(BookRepository.class);

        List<Book> books = null;
        books = BookRepository.findAll();
        Book testBook1 = BookRepository.getById(1);
        Book testBook2 = BookRepository.getById(2);
        Book testBook3 = BookRepository.getById(3);
        System.out.println("Book count " + BookRepository.count());
        Console.main(args);
    }
}
