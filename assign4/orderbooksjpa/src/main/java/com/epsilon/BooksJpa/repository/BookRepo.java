package com.epsilon.BooksJpa.repository;

import com.epsilon.BooksJpa.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepo extends JpaRepository<Book, String> {
}
