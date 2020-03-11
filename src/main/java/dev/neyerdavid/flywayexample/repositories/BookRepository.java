package dev.neyerdavid.flywayexample.repositories;

import dev.neyerdavid.flywayexample.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository  extends JpaRepository<Book, Long> {
}
