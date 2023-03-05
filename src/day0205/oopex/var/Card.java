package day0205.oopex.var;

public class Card {
	static int width;
	static int height;
	String kind;
	int number;
	
	String cardKind() {
		return kind + " " + number;
	}

}
