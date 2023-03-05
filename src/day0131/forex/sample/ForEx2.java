package day0131.forex.sample;

import java.util.Scanner;

public class ForEx2 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요.");
		int num = s.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			sum +=i;
		}
		
		System.out.println(sum + "입니다.");
		
		

	}

}
