package day0129;

import java.util.Scanner;

/*if(조건식1) {
 조건식의 결과가 true일 때 실행할 문장
 }else if(조건식2){
 조건식의 결과가 true일 때 실행할 문장
 }else{
 조건식의 결과가 false일 때 실행할 문장
 }*/
public class ElseIfEx1 {
	public static void main(String[] args) {
		
		int code;
		int d;
		int dan; //단가
		int qt;
		int amt;
		
		Scanner s = new Scanner(System.in);
		System.out.println("코드를 입력하세요");
		code = s.nextInt();
		System.out.println("등급을 입력하세요");
		d = s.nextInt();
		System.out.println("사용량을 입력하세요");
		qt = s.nextInt();
		
		if(d==1) {
			dan = 500;
		}else if(d==2) {
			dan = 400;
		}else {
			dan = 300;
		}
		
		amt = dan * qt;
		
		System.out.printf("사용자 번호 : %d 등급 : %d 사용액 : %d ",code,d,amt);

	}

}
