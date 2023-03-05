package ncs.test;

public class Food {
	int price;
	int point;
	
	public Food() {}
	public Food(int price) {
		this.price = price;
		point = price/10;
	}
	
	public String getName() {
		return "";
	}

}
