package ru.sergey_gusarov.hw7.dao.books;

import ru.sergey_gusarov.hw7.domain.books.Book;

import java.util.List;

public interface BookRepository {
    int count();

    int insert(Book book);

    Book getById(int id);

    List<Book> findAll();

    int update(Book book);

    int delete(Book book);

}
