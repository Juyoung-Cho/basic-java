package day0213.poly.sample;
//제품 - Tv, Computer
public class Product {
	int price;
	int bonusPoint;
	public Product() {}
	public Product(int price) {
		this.price = price;
		bonusPoint = price/10;
	}

}
