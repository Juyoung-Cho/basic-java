package day0129;

import java.util.Scanner;

//3 개의 정수를 입력받아 최대값을 출력하세요.
public class IfEx02 {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int max; //최대값 저장
		
		Scanner s = new Scanner(System.in);
		System.out.println("첫 번째 정수를 입력하세요 => ");
		a = s.nextInt();
		System.out.println("두 번째 정수를 입력하세요 => ");
		b = s.nextInt();
		System.out.println("세 번째 정수를 입력하세요 => ");
		c = s.nextInt();
		
		if(a>b) {
			max = a;
		}else {
			max = b;
		}
		
		if(c>max) {
			max = c;
		}
		
		System.out.printf("%d, %d, %d 중 최대값은 %d입니다.",a,b,c,max);

	}

}
