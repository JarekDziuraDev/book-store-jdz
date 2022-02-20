package com.example.bookstorejdz.service;

import com.example.bookstorejdz.dto.BookDto;
import com.example.bookstorejdz.model.Book;
import com.example.bookstorejdz.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class BookServiceTest {
    Random random = new Random();

    @InjectMocks
    private BookService bookService;

    @Mock
    private BookRepository bookRepository;

    @Mock
    private ModelMapper modelMapper;

    @Test
    void shouldReturnListOfBookDtoWhenGetBooksCalled() {
        List<Book> books = new ArrayList<>();
        Book book = getBook();
        books.add(book);
        BookDto bookDto = getBookDto();

        when(bookRepository.findAll()).thenReturn(books);
        when(modelMapper.map(book, BookDto.class)).thenReturn(bookDto);

        List<BookDto> bookDtos = bookService.getBooks();

        assertThat(1).isEqualTo(bookDtos.size());
        assertThat(bookDtos.get(0))
                .isNotNull()
                .hasFieldOrPropertyWithValue("title", "Test")
                .hasFieldOrPropertyWithValue("description","Test")
                .hasFieldOrPropertyWithValue("releaseYear",2018);
    }

    private Book getBook() {
        return Book.builder()
                .title("Test")
                .description("Test")
                .id(random.nextLong())
                .releaseYear(2018)
                .build();
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