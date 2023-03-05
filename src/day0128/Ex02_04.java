package day0128;

import java.util.Scanner;
//두 수를 읽어 변수 A는 1증가, 변수 B는 1감소시켜 출력
public class Ex02_04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("A를 입력하시오. ");
		int A = s.nextInt();
		System.out.println("B를 입력하시오. ");
		int B = s.nextInt();
		
		System.out.print("A = "+A+", B = "+B);
		System.out.println("change");
		A = A+1;
		B = B-1;
		System.out.println("A = "+A+", B = "+B);

	}

}
