package day0130.operator.sample;

import java.util.Scanner;

//입력한 값이 짝수이면서 100이상의 값이라면 
//입력한 값을 출력하고 아니면 "알맞은 값이 아닙니다"라는 문장을 출력하기.
public class OperEx10 {
	public static void main(String[] args) {
		
		int data;
		System.out.print("값을 입력하세요.");
		Scanner s =  new Scanner(System.in);
		data = s.nextInt();
		
		if(data%2==0 && data>=100) {
			System.out.println(data);
		}else {
			System.out.println("알맞은 값이 아닙니다.");
		}

	}

}
