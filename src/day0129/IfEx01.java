package day0129;

import java.util.Scanner;

/*
 if(조건식) {
 조건식의 결과가 true일 때 실행할 문장
 }
 if(조건식) {
 조건식의 결과가 true일 때 실행할 문장
 }else{
 조건식의 결과가 false일 때 실행할 문장
 }
 */
public class IfEx01 {
	public static void main(String[] args) {
		
		int a;
		int b;
		int max; //최대값 저장
		
		Scanner s = new Scanner(System.in);
		System.out.println("첫 번째 정수를 입력하세요 => ");
		a = s.nextInt();
		System.out.println("두 번째 정수를 입력하세요 => ");
		b = s.nextInt();
		
		if(a>b) {
			max = a;
		}else {
			max = b;
		}
		
		System.out.printf("%d와 %d 중 최대값은 %d입니다.",a,b,max);

	}

}
