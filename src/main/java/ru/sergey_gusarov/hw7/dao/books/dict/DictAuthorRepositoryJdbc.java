package ru.sergey_gusarov.hw7.dao.books.dict;

import org.springframework.stereotype.Repository;
import ru.sergey_gusarov.hw7.domain.books.Author;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class DictAuthorRepositoryJdbc implements DictAuthorRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public int count() {
        return 0;
    }

    @Override
    public int insert(Author author) {
        return 0;
    }

    @Override
    public Author getById(int id) {
        return em.find(Author.class, id);
    }

    @Override
    public Author getByName(String name) {
        return null;
    }

    @Override
    public List<Author> findAll() {
        return null;
    }

    @Override
    public int update(Author author) {
        return 0;
    }

    @Override
    public int delete(Author author) {
        return 0;
    }

}
