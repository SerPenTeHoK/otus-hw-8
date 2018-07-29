package ru.sergey_gusarov.hw7.domain.books;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Book {
    @Id
    @GeneratedValue
    private int id;
    private String title;
    @ManyToMany
    @JoinTable(name = "BOOK_GENRE_REL",
            joinColumns = @JoinColumn(name = "BOOK_ID"),
            inverseJoinColumns = @JoinColumn(name = "GENRE_ID"))
    private Set<Genre> genres;

    @ManyToMany
    @JoinTable(name = "BOOK_AUTHOR_REL",
            joinColumns = @JoinColumn(name = "BOOK_ID"),
            inverseJoinColumns = @JoinColumn(name = "AUTHOR_ID"))
    private Set<Author> authors;

    @OneToMany(mappedBy = "book", cascade=CascadeType.ALL, orphanRemoval=true)
    private Set<BookComments> bookComments;

    public Set<BookComments> getBookComments() {
        return bookComments;
    }

    public void setBookComments(Set<BookComments> bookComments) {
        this.bookComments = bookComments;
    }

    public Book(int id, String title, Set<Genre> genres, Set<Author> authors) {
        this.id = id;
        this.title = title;
        this.genres = genres;
        this.authors = authors;
    }

    public Set<Genre> getGenres() {
        return genres;
    }

    public void setGenres(Set<Genre> genres) {
        this.genres = genres;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
