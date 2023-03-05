package day0129;

import java.util.Scanner;

public class ElseIfEx2 {
	public static void main(String[] args) {
		
		int code;
		int time;
		int cost;
		double amt; //0.5
		int ot = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("사원번호를 입력하세요");
		code = s.nextInt();
		System.out.println("시간을 입력하세요");
		time = s.nextInt();
		System.out.println("시간당 금액을 입력하세요");
		cost = s.nextInt();
		
		if(time > 40) {
			ot = time - 40;
		}
		
		amt = time * cost + (ot*cost*0.5);
		
		System.out.printf("%d의 총급여는 %,.2f입니다.",cost, amt);
		// %d = 정수, %s = 문자열, 
		// %f = 실수 (%,.2f >> ,: 3자리마다 ','출력 .2:소수점 2번째 자리까지 표현

	}

}
