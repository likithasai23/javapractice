package com.epsilon.BooksJpa.controllers;


import com.epsilon.BooksJpa.models.Publisher;
import com.epsilon.BooksJpa.services.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PublisherController {

        @Autowired
        private PublisherService publisherService;

        @PostMapping(path = "/publisher")
    public Publisher createPublisher(@RequestBody Publisher publisher){
            return this.publisherService.createPublisher1(publisher);
        }


        @GetMapping(path="/publisher")
    public List<Publisher> getAllPublishers(){
            return this.publisherService.getAllPublishers2();
        }

    @GetMapping(path = "publisher/{id}")
    public Optional<Publisher> getPublisher(@PathVariable String id) {
        return this.publisherService.getPublisher3(id);
    }


    @PutMapping(path = "/publisher/{id}")

    public Publisher updatePublisher(@PathVariable String id, @RequestBody Publisher pb){
        return this.publisherService.updatePublisher5(id,pb);
    }


    @DeleteMapping(path = "/publisher/{id}")
    public void deletePublisher(@PathVariable String id){
             this.publisherService.deletePublisher1(id);
    }



}
