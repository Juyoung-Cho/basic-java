package day0129;

import java.util.Scanner;

public class ElseIfEx4 {
	public static void main(String[] args) {
		
		int code;
		int price;
		int age;
		double rate = 0;
		double dc_price;
		double r_price;
		
		Scanner s = new Scanner(System.in);
		System.out.println("회원번호를 입력하세요");
		code = s.nextInt();
		System.out.println("정가를 입력하세요");
		price = s.nextInt();
		System.out.println("나이를 입력하세요");
		age = s.nextInt();
		
		if(age < 18 || age >= 70) {
			rate = 0.2;
		}else if(age >= 60 && age < 70) {
			rate = 0.15;
		}else if(age >=18 && age < 60) {
			rate = 0;
		}
		
		dc_price = price * rate;
		r_price = price - dc_price;
		
		System.out.printf(
		"%d의 할인액은 %.0f이고, 실구입가는 %.0f입니다.",code,dc_price,r_price);

	}

}
