package day0131.ifex.sample;

import java.util.Scanner;

public class IfEx4 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요. => ");
		int age = s.nextInt();
		int charge = 0; //요금
		
		if(age < 8) {
			System.out.println("미취학 아동입니다.");
			charge = 1000;
		}else if(age < 14) {
			System.out.println("초등학생입니다.");
			charge = 2000;
		}else if(age < 20) {
			System.out.println("중고등학생입니다.");
			charge = 2500;
		}else {
			System.out.println("성인입니다.");
			charge = 3000;
		}
		
		System.out.println("요금은 "+ charge + "원입니다.");
		

	}

}
