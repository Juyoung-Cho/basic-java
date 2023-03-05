package day0205.oopex.var;

public class CardTest {
	public static void main(String[] args) {
		Card.width = 50;
		Card.height = 100;
		
		Card c1 = new Card();
		c1.kind = "spade";
		c1.number = 7;
		System.out.println(c1.cardKind());
		
		Card c2 = new Card();
		c2.kind = "clover";
		c2.number = 10;
		System.out.println(c2.cardKind());
		
		

	}

}
