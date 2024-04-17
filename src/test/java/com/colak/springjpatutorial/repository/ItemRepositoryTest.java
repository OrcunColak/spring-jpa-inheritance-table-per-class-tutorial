package com.colak.springjpatutorial.repository;

import com.colak.springjpatutorial.jpa.Book;
import com.colak.springjpatutorial.jpa.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ItemRepositoryTest {
    @Autowired
    private ItemRepository repository;

    @Test
    void findById() {
        // SELECT
        //     i1_0.id,
        //     i1_0.clazz_,
        //     i1_0.item_name,
        //     i1_0.author,
        //     i1_0.isbn,
        //     i1_0.director,
        //     i1_0.duration
        // FROM (
        // -- This subquery selects columns from the "items" table, and it introduces columns with null values for author, isbn,
        // -- director, and duration. The 0 as clazz_ column is added to identify the class type (0 represents items).
        //     SELECT
        //         id,
        //         item_name,
        //         null as author,
        //         null as isbn,
        //         null as director,
        //         null as duration,
        //         0 as clazz_
        //     FROM items
        //     UNION ALL
        // --  It introduces columns with null values for director and duration and uses 1 as clazz_ to identify the class type
        // -- (1 represents books).
        //     SELECT
        //         id,
        //         item_name,
        //         author,
        //         isbn,
        //         null as director,
        //         null as duration,
        //         1 as clazz_
        //     FROM books
        //     UNION ALL
        //     SELECT
        //         id,
        //         item_name,
        //         null as author,
        //         null as isbn,
        //         director,
        //         duration,
        //         2 as clazz_
        //     FROM movies
        // ) i1_0
        // WHERE i1_0.id = ?;

        // So, the entire query retrieves data from "items," "books," and "movies" tables, combines them using UNION ALL
        // with additional columns for class identification, and then filters the result based on a specified id.
        // The clazz_ column is used to distinguish between different classes in the combined result set.
        Optional<Item> optional = repository.findById(3L);
        assertThat(optional).isNotEmpty();
        assertThat(optional.get()).isExactlyInstanceOf(Book.class);
    }
}
