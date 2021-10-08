package com.epsilon.BooksJpa.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.epsilon.BooksJpa.models.Author;
import com.epsilon.BooksJpa.services.AuthorService;





@RestController
public class AuthorController {
	@Autowired
	 private AuthorService authorService ;
	 
	 
	@PostMapping(path="/author")
	public Author createPlayer(@RequestBody Author player) {
		return this.authorService.createAuthor(player);
	}
	
	
	@GetMapping(path="/author")
	@CrossOrigin(origins = "*")
	public List<Author> getAuthor(){
		return this.authorService.getAllAuthors();
	}
	
	@GetMapping(path="/author/{authorID}")
	public Optional<Author> getAuthorById(@PathVariable String authorID) {
		return this.authorService.getAuthorById(authorID);
	}
	
	@DeleteMapping(path="/author/{authorID}")
	public void deleteAuthor(@PathVariable String authorID) {
	 this.authorService.deletePlayerById(authorID);
	
	}
	
	
	
	
	
}
