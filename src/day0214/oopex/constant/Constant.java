package day0214.oopex.constant;

class Card{
	static final int width = 100;
	static final int height = 250;
	final int num; //객체마다 값이 달라야 하는 인스턴스 변수의 경우 final 변수 선언만 하고
	final String kind; //생성자에서 단 한번 저장.
	
	public Card(int num, String kind) {
		this.num = num;
		this.kind = kind;
	}

	@Override
	public String toString() {
		return "Card [num=" + num + ", kind=" + kind + "]";
	}

	

	
	
}
public class Constant {
	public static void main(String[] args) {
		Card c1 = new Card(10 , "Heart");
		Card c2 = new Card(5, "Spade");
		
		// c1.num = 5;
		// c1.kind = "Spade"; 
		// final이므로 이렇게 바꿀 수 없다.
		
		System.out.println(c1);
		System.out.println(c2);
		
		

	}

}
