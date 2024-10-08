package com.example.book_service.controller;

import com.example.book_service.entity.BookEntity;
import com.example.book_service.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    BookRepository book_repo;

    @GetMapping("/books")
    public List<BookEntity> getAllBooks()
    {
        return  book_repo.findAll();
    }

    @PostMapping("/books")
    public BookEntity addBook(@RequestBody BookEntity bookEntity)
    {
      book_repo.saveAndFlush(bookEntity);
      return bookEntity;
    }

    @GetMapping("/books/{id}")
    public Optional<BookEntity> getABook(@PathVariable("id") long bookId)

    {
        return book_repo.findById(bookId);
    }

    @DeleteMapping("/books/{id}")
    public void deleteBook(@PathVariable("id") long bookId)
    {
        book_repo.deleteById(bookId);
    }


}
