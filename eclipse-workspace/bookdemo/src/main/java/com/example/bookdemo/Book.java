package com.example.bookdemo;



import jakarta.persistence.Entity;

import jakarta.persistence.Id;



@Entity

public class Book {

	@Id

	private int bookId;

	private String title;

	private String author;

	private String category;

	private int price;

	private int available;

	public void setId(int bookId) {

		this.bookId = bookId;

	}

	public void setTitle(String title) {

		this.title = title;

	}

	public void setAuthor(String author) {

		this.author = author;

	}

	public void setCategory(String category) {

		this.category = category;

	}

	public void setPrice(int price) {

		this.price = price;

	}



	public void setAvailable(int available) {

		this.available = available;

	}

	public int getId() {

		return bookId;

	}

	public String getTitle() {

		return title;

	}

	public String getAuthor() {

		return author;

	}

	public String getCategory() {

		return category;

	}

	public int getPrice() {

		return price;

	}

	public int getAvailable() {

		return available;

	}

}