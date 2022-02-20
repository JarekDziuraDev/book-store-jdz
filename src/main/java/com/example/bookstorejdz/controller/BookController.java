package com.example.bookstorejdz.controller;

import com.example.bookstorejdz.dto.BookDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/books")
public class BookController {

    @GetMapping
    public ResponseEntity<List<BookDto>> getAllBooks() {
        BookDto book1 = BookDto.builder()
                .title("TestBook1")
                .build();

        List<BookDto> books = new ArrayList<>();
        books.add(book1);

        return ResponseEntity.ok(books);
    }
}
