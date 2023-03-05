package day0128;

import java.util.Scanner;

//두 개의 정수를 입력받아 교환하기
public class Ex02_03 {
	public static void main(String[] args) {
		
		int x;
		int y;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하시오."); //ln이 없으면 줄 바꾸지 않음.
		x = s.nextInt();
		System.out.println("두 번째 정수를 입력하시오.");
		y = s.nextInt();
		
		System.out.println("x= "+x+", y="+y);
		System.out.println("change");
		
		int z = x;
		x = y;
		y = z;
		
		System.out.println("x= "+x+", y="+y);

	}
}
