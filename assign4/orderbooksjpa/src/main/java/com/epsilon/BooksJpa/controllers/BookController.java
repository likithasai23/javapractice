package com.epsilon.BooksJpa.controllers;


import com.epsilon.BooksJpa.models.Book;
import com.epsilon.BooksJpa.services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    private BookServices bookServices;


    @PostMapping(path = "/book")
    private Book createBook(@RequestBody Book book){
        return this.bookServices.createBook(book);
    }

    @GetMapping(path = "/book")
    public List<Book> getBooks(){
        return this.bookServices.getBooks();
    }

    @GetMapping(path = "/book/{id}")
    public Optional<Book> getBookById(@PathVariable String id ){
        return this.bookServices.getBookById(id);
    }
    @PutMapping(path = "/book/{id}")
    public Book updateBook(@PathVariable String id , @RequestBody Book book){
        return this.bookServices.updateBook(id,book);
    }
}
