package day0302.io.sample;

public class Book {
	
	int no;
	String bookName;
	String publisher;
	int price;
	public Book(int no, String bookName, String publisher, int price) {
		this.no = no;
		this.bookName = bookName;
		this.publisher = publisher;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [no=" + no + ", bookName=" + bookName + ", publisher=" + publisher + ", price=" + price + "]\n";
	}
	
	
	

}
