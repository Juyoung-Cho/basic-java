package day0131.ifex.sample;

import java.util.Scanner;

public class IfEx1 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요. => ");
		int age = s.nextInt();
		
		// {} 생략가능. 단, 블럭이 생략되면 바로 뒤 첫 문장만 if문에 포함.
		// 수행문이 한 줄이라면, 블럭 생략가능(가독성을 위해 그러지 말자)
		if(age >= 8) {
			System.out.println("학교에 다닙니다.");
		}else {
			System.out.println("학교에 다니지 않습니다.");
		}

	}

}
