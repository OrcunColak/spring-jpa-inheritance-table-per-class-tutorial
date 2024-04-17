package com.colak.springjpatutorial.repository;

import com.colak.springjpatutorial.jpa.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class BookRepositoryTest {
    @Autowired
    private BookRepository repository;

    @Test
    void findById() {
        List<Book> bookList = repository.findAll();

        // select ... from books b where b.id=?
        Optional<Book> optional = repository.findById(3L);
        assertThat(optional).isNotEmpty();
        assertThat(optional.get().getItemName()).isEqualTo("Book 1");
    }
}
