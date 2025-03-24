package com.model;

public class Book {
	private int bookid;
	private String title;
	private String author;
	private String category;
	private float price;
	public Book(int bookid, String title, String author, String category, float price) {
		super();
		this.bookid = bookid;
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", title=" + title + ", author=" + author + ", category=" + category
				+ ", price=" + price + "]";
	}
	

}
