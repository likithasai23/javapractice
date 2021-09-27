package com.epsilon.Project;

public class Author {
	
	int Authorid;
	String AuthorName;
	public int getAuthorid() {
		return Authorid;
	}
	public void setAuthorid(int authorid) {
		Authorid = authorid;
	}
	public String getAuthorName() {
		return AuthorName;
	}
	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}
	@Override
	public String toString() {
		return "Author [Authorid=" + Authorid + ", AuthorName=" + AuthorName + "]";
	}
	
}
