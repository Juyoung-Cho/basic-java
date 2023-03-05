package ncs.test1;

import java.util.Scanner;

public class GoodsTest {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("다음 항목의 값을 입력하시오.");
		System.out.print("상품명 : ");
		String name = s.nextLine();
		System.out.print("가격 : ");
		int price = s.nextInt();
		System.out.print("수량 : ");
		int quantity = s.nextInt();
		
		Goods goods = new Goods(name, price, quantity);
		
		System.out.println("입력된 결과는 다음과 같습니다.");
		System.out.println(goods);
		System.out.println("총 구매 가격 :"+ goods.getPrice()*goods.getQuantity());

	}

}
