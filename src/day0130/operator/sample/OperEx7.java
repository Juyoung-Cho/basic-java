package day0130.operator.sample;

import java.util.Scanner;

public class OperEx7 {
	public static void main(String[] args) {
		System.out.print("나이를 입력해주세요. : ");
		
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		
		System.out.println(age <= 20); //입력한 값에 따라 true/false 출력
		
		if(age<=20) {
			System.out.println("미성년자 입니다.");
		}else {
			System.out.println("성인입니다.");
		}

	}

}
