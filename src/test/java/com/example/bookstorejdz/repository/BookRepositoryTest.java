package com.example.bookstorejdz.repository;

import com.example.bookstorejdz.model.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.stream.StreamSupport;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@Sql(scripts = {"classpath:insertInitialBookRecordForTest.sql"})
class BookRepositoryTest {
    @Autowired
    private BookRepository bookRepository;

    @Test
    void shouldAbleToFetchAllBooksInDB() {
        Iterable<Book> books = bookRepository.findAll();
        Long totalBookCount = StreamSupport.stream(books.spliterator(),false)
                .count();
        Assertions.assertEquals(totalBookCount,2 );
    }

    @Test
    void shouldReturnOneBookWhenTitleIsTestTitle() {
        List<Book> testTitle = bookRepository.findBooksByTitle("Test");
        Assertions.assertEquals(testTitle.size(), 1);

    }
}