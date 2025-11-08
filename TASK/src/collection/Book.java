package collection;
import java.util.ArrayList;
//This program uses ArrayList to store book names, search for a specific book, and sort the list alphabetically.
import java.util.Collections;
public class Book {	
	    public static void main(String[] args) {
	        ArrayList<String> books = new ArrayList<>();
	        // Add books
	        books.add("The Alchemist");
	        books.add("Harry Potter");
	        books.add("The Hobbit");

	        // Display all books
	        System.out.println("Books in the list:");
	        for (String book : books) {
	            System.out.println(book);
	        }

	        // Search for a book
	        String search = "Harry Potter";
	        if (books.contains(search)) {
	            System.out.println("\nFound: " + search);
	        } else {
	            System.out.println("\nNot found: " + search);
	        }

	        // Sort the list
	        Collections.sort(books);
	        System.out.println("\nSorted book list:");
	        for (String book : books) {
	            System.out.println(book);
	        }
	    }
}

