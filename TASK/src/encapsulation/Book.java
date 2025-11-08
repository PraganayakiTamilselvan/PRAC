package encapsulation;
public class Book {
private String title; //Private Fields
private String author;
private Double price;
private int year;
//This program shows encapsulation by using private fields with public getter and setter methods to safely manage book details.
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
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
@Override
public String toString() {
	return "Book [title=" + title + ", author=" + author + ", price=" + price + ", year=" + year + ", getTitle()="
			+ getTitle() + ", getAuthor()=" + getAuthor() + ", getPrice()=" + getPrice() + ", getYear()=" + getYear()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
	public static void main(String[] args) {
	    Book book1 = new Book(); //CREATING BOOK USING SETTER 
	    book1.setTitle("The Alchemist");
	    book1.setAuthor("Paulo Coelho");
	    book1.setPrice(499.99);
	    book1.setYear(1988);
	    
	    Book book2 = new Book(); // ANOTHER BOOK
	    book2.setTitle("Verity");
	    book2.setAuthor("Coolen Hover");
	    book2.setPrice(456.90);
	    book2.setYear(2008);
	    System.out.println(book1);
	    System.out.println(book2);
	    System.out.println("Title of book1: " + book1.getTitle()); //GETTING THE VALUES WE NEED
	    System.out.println("Author of book2: " + book2.getAuthor());
	}


}

