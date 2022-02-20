package com.example.bookstorejdz.controller;

import com.example.bookstorejdz.dto.BookDto;
import com.example.bookstorejdz.service.BookService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class BookControllerTest {
    Random random = new Random();

    @InjectMocks
    private BookController bookController;

    @Mock
    private BookService bookService;

    @Test
    void shouldReturnBookDtoListWhenGetBooksCalled() {
        List<BookDto> bookDtos = new ArrayList<>();
        bookDtos.add(getBookDto());
        when(bookService.getBooks()).thenReturn(bookDtos);
        ResponseEntity<List<BookDto>> books = bookController.getBooks();
        assertThat(books.getBody()).isNotNull();
        assertThat(books.getBody().size()).isEqualTo(1);
    }

    private BookDto getBookDto() {
        return BookDto.builder()
                .title("Test")
                .description("Test")
                .id(random.nextLong())
                .releaseYear(2018)
                .build();
    }
}