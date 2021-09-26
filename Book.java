package com.epsilon.Project;

public class Book {
	
	int Bookid;
	String Bookname;
	Publisher publisher;
	 Author author;
	public int getBookid() {
		return Bookid;
	}
	public void setBookid(int bookid) {
		Bookid = bookid;
	}
	public String getBookname() {
		return Bookname;
	}
	public void setBookname(String bookname) {
		Bookname = bookname;
	}
	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [Bookid=" + Bookid + ", Bookname=" + Bookname + ", publisher=" + publisher + ", author=" + author
				+ "]";
	}
	
	
	

}
