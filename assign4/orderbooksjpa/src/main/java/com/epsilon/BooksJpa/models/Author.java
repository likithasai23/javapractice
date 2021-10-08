package com.epsilon.BooksJpa.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="authors")
public class Author {

	String authorName;
	@Id
	String authorID;
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getAuthorID() {
		return authorID;
	}
	public void setAuthorID(String authorID) {
		this.authorID = authorID;
	}
	@Override
	public String toString() {
		return "Author [authorName=" + authorName + ", authorID=" + authorID + "]";
	}
	
}
