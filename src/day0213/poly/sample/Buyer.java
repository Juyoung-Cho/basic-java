package day0213.poly.sample;

public class Buyer {
	
	int money = 1000;
	int bonusPoint = 0;
	
	public void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p+"구입함.");
	}
	
	
	
	
	/*public void buy(Tv tv) {
		if(money < tv.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		money -= tv.price;
		bonusPoint += tv.bonusPoint;
		System.out.println(tv+"구입함."); //toString 메서드가 호출
	}
	public void buy(Computer computer) {
		if(money < computer.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		money -= computer.price;
		bonusPoint += computer.bonusPoint;
		System.out.println(computer+"구입함.");
	}*/

}
