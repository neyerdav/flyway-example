package dev.neyerdavid.flywayexample.services;

import dev.neyerdavid.flywayexample.models.Book;
import dev.neyerdavid.flywayexample.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> list() {
        return  bookRepository.findAll();
    }
}
