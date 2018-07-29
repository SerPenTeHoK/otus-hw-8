package ru.sergey_gusarov.hw7.dao.books;

import org.springframework.stereotype.Repository;
import ru.sergey_gusarov.hw7.domain.books.Book;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Map;

@Repository
public class BookRepositoryJdbc implements BookRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public int count() {
        return 0;
    }

    @Override
    public int insert(Book book) {
        return 0;
    }

    @Override
    public Book getById(int id){
        return em.find(Book.class, id);
    }

    @Override
    public List<Book> findAll() {
        return null;
    }

    @Override
    public int update(Book book) {
        return 0;
    }

    @Override
    public int delete(Book book) {
        return 0;
    }

    private Book getBook(Map<Integer, String> genres, Map<Integer, String> authors, Integer id, String title) {
        return null;
    }
}
