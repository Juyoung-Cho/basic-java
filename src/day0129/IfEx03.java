package day0129;

import java.util.Scanner;

//두 수를 읽어서 큰 수에서 작은 수를 뺀 결과를 출력
public class IfEx03 {
	public static void main(String[] args) {
		
		int a;
		int b;
		int result;
		
		Scanner s = new Scanner(System.in);
		System.out.println("첫 번째 수를 입력하시오. => ");
		a = s.nextInt();
		System.out.println("두 번째 수를 입력하시오. => ");
		b = s.nextInt();
		
		if(a>=b) {
			result = a-b;
		}else {
			result = b-a;
		}
		
		System.out.printf("큰 수에서 작은 수를 빼면 %d입니다.",result);
		

	}

}
