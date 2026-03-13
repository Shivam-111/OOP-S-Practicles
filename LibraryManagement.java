// Lab Assignment - Book & Library
// Shivam Dipte

import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
    }
}

class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getIsbn());
    }

    public void removeBook(String isbn) {
        boolean removed = false;
        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) {
                books.remove(b);
                System.out.println("Book removed: " + isbn);
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Book with ISBN " + isbn + " not found.");
        }
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("\nAvailable Books:");
            for (Book b : books) {
                b.displayInfo();
            }
        }
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books
        library.addBook(new Book("Java Basics", "James Gosling", "ISBN001"));
        library.addBook(new Book("Python Essentials", "Guido van Rossum", "ISBN002"));
        library.addBook(new Book("C++ Fundamentals", "Bjarne Stroustrup", "ISBN003"));

        // Display all books
        library.displayBooks();

        // Remove a book
        library.removeBook("ISBN002");

        // Display again
        library.displayBooks();
    }
}