package day0213.poly.sample;

public class Shopping {
	public static void main(String[] args) {
		Tv t = new Tv();
		Computer com = new Computer();
		
		Buyer b = new Buyer();
		b.buy(t);
		b.buy(com);
		
		System.out.println("현재 남은 돈 : "+b.money);
		System.out.println("현재 보너스포인트 : "+b.bonusPoint);

	}

}
