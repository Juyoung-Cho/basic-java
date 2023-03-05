package ncs.test;

public class Customer {
	int money = 10000;
	int point = 0;
	
	public void order(Food f) {
		if(money < f.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		money -= f.price;
		point += f.point;
		System.out.println(f.getName()+"구입함.");
	}
	
}
