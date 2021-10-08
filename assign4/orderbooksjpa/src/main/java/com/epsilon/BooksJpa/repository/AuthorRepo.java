package com.epsilon.BooksJpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epsilon.BooksJpa.models.Author;


@Repository
public interface AuthorRepo extends JpaRepository<Author,String> {

}
