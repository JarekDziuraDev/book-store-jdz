package com.example.bookstorejdz.repository;


import com.example.bookstorejdz.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findBooksByTitle(String title);
//    List<Book> findAll();
}
