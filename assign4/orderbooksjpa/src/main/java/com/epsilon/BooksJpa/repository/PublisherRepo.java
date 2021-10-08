package com.epsilon.BooksJpa.repository;


import com.epsilon.BooksJpa.models.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepo extends JpaRepository<Publisher,String> {
}
