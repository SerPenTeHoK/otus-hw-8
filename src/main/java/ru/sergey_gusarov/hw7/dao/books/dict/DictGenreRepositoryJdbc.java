package ru.sergey_gusarov.hw7.dao.books.dict;

import org.springframework.stereotype.Repository;
import ru.sergey_gusarov.hw7.domain.books.Author;
import ru.sergey_gusarov.hw7.domain.books.Genre;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class DictGenreRepositoryJdbc implements DictGenreRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public int count() {
        return 0;
    }

    @Override
    public int insert(Genre genre) {
        return 0;
    }

    @Override
    public Genre getById(int id) {
        return em.find(Genre.class, id);
    }

    @Override
    public Genre getByName(String name) {
        return null;
    }

    @Override
    public List<Genre> findAll() {
        return null;
    }

    @Override
    public int update(Genre genre) {
        return 0;
    }

    @Override
    public int delete(Genre genre) {
        return 0;
    }
}
