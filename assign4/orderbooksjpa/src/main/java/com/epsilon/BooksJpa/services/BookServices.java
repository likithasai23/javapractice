package com.epsilon.BooksJpa.services;


import com.epsilon.BooksJpa.models.Author;
import com.epsilon.BooksJpa.models.Book;
import com.epsilon.BooksJpa.models.Publisher;
import com.epsilon.BooksJpa.repository.AuthorRepo;
import com.epsilon.BooksJpa.repository.BookRepo;
import com.epsilon.BooksJpa.repository.PublisherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class BookServices {

    @Autowired
    private BookRepo Bookrepo;

    @Autowired
    private AuthorRepo Authorepo;

    @Autowired
    private PublisherRepo publisherRepo;


    public Book createBook(Book book) {
        book.setId(UUID.randomUUID().toString());
        Author author =this.Authorepo.findById(book.getAuthor().getAuthorID()).get();
        Publisher pb=this.publisherRepo.findById(book.getPublisher().getId()).get();
        book.setAuthor(author);
        book.setPublisher(pb);
        return this.Bookrepo.save(book);



    }

    public List<Book> getBooks() {
        return this.Bookrepo.findAll();
    }

    public Optional<Book> getBookById(String id) {
        return this.Bookrepo.findById(id);
    }

    public Book updateBook(String id, Book book) {
        book.setId(id);
        Author author= this.Authorepo.findById(book.getAuthor().getAuthorID()).get();
        Publisher pb=this.publisherRepo.findById(book.getPublisher().getId()).get();
        book.setAuthor(author);
        book.setPublisher(pb);

        return this.Bookrepo.save(book);
    }
}
