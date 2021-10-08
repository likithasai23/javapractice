package com.epsilon.BooksJpa.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epsilon.BooksJpa.models.Author;
import com.epsilon.BooksJpa.repository.AuthorRepo;


@Service
public class AuthorService {
	
	
	@Autowired
	private AuthorRepo authorRepo;
	

	public Author createAuthor(Author player) {
		player.setAuthorID(UUID.randomUUID().toString());
		authorRepo.save(player);
		return player;
	}


	public List<Author> getAllAuthors() {
		return this.authorRepo.findAll();
		
	}


	public Optional<Author> getAuthorById(String authorID) {
		
		return this.authorRepo.findById(authorID);
	}


	public void deletePlayerById(String authorID) {
		this.authorRepo.deleteById(authorID);
		
	}

}
