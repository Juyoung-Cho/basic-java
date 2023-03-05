package day0129;

import java.util.Scanner;

//하나의 정수를 입력받아 짝수인지 홀수인지 출력하세요.
public class IfEx04 {
	public static void main(String[] args) {
		
		int a;
		
		Scanner s = new Scanner(System.in);
		System.out.print("수를 입력하세요. =>");
		a = s.nextInt();
		
		if(a%2==0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
		

	}

}
