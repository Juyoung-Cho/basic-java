package day0214.interfaceex.sample;

public class BookShelfTest {
	public static void main(String[] args) {
		Queue shelf = new BookShelf();
		shelf.enQueue("The Life");
		shelf.enQueue("Show me the money");
		shelf.enQueue("Lala land");
		
		System.out.println(shelf.deQueue());
		System.out.println(shelf.deQueue());
		System.out.println(shelf.deQueue());
		
		

	}

}
