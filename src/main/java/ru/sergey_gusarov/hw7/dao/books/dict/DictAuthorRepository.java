package ru.sergey_gusarov.hw7.dao.books.dict;

import ru.sergey_gusarov.hw7.domain.books.Author;

import java.util.List;

public interface DictAuthorRepository {
    int count();

    int insert(Author author);

    Author getById(int id);

    Author getByName(String name);

    List<Author> findAll();

    int update(Author author);

    int delete(Author author);

}
