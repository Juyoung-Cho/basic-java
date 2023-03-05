package book;

public class BookTest {
	public static void main(String[] args) {
		Book b1 = new Book("SQL Plus",50000,5);
		Book b2 = new Book("JAVA 2.0",40000,3);
		Book b3 = new Book("JSP Servlet",60000,6);
		
		Book[] books = {b1,b2,b3};
		System.out.println("책이름\t\t가격\t할인율\t할인후금액");
		
		for(Book b : books) {
			System.out.println(b);
		}

	}

}
