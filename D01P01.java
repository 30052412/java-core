package com.learning.core.day1session1;

public class D01P01 {
	
	private String bookTitle;
    private double bookPrice;

    // Constructor
    public D01P01(String bookTitle, double bookPrice) {
        this.bookTitle = bookTitle;
        this.bookPrice = bookPrice;
    }

    // Getter and Setter methods for bookTitle
    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    // Getter and Setter methods for bookPrice
    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    // Method to create books
    public static D01P01 createBook(String title, double price) {
        return new D01P01(title, price);
    }

    // Method to display book details
    public void showBook() {
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Book Price: " + bookPrice);
    }

	public static void main(String[] args) 
	{
		 // Input
        String title = "Java Programming";
        double price = 350.00;

        // Creating a Book object
        D01P01 book = D01P01
        		.createBook(title, price);

        // Displaying book details
        book.showBook();

	}

}