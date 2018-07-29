package ru.sergey_gusarov.hw7.domain.books;

import javax.persistence.*;
import java.util.Date;

@Entity
public class BookComments {
    @Id
    @GeneratedValue
    int id;
    Book book;
    String text;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
