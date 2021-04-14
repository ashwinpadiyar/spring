package com.springcore.javaconfig;

public class Student {
	private Book book;

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public void study() {
		book.review();
		System.out.println("Time to Read");
	}
	
	public Student(Book book) {
		super();
		this.book = book;
	}

	@Override
	public String toString() {
		return "Student [book=" + book + "]";
	}


}
