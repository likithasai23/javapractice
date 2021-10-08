package com.epsilon.BooksJpa.services;

import com.epsilon.BooksJpa.models.Publisher;
import com.epsilon.BooksJpa.repository.PublisherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Service
public class PublisherService {

    @Autowired
    private PublisherRepo publisherRepo;

    public Publisher createPublisher1(Publisher publisher) {
        publisher.setId(UUID.randomUUID().toString());
        return this.publisherRepo.save(publisher);
    }

    public List<Publisher> getAllPublishers2() {

            return this.publisherRepo.findAll();

    }

    public Optional<Publisher> getPublisher3(String id) {
        return this.publisherRepo.findById(id);
    }

    public Publisher updatePublisher5(String id, Publisher pb) {
        pb.setId(id);
        return this.publisherRepo.getById(id);
    }

    public void deletePublisher1(String id) {
this.publisherRepo.deleteById(id);
    }
}
