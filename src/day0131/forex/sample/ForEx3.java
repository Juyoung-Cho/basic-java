package day0131.forex.sample;

import java.util.Scanner;
//숫자를 입력하면 그 숫자에 맞는 구구단을 출력
public class ForEx3 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("숫자 입력 => ");
		int num = s.nextInt();
		
		System.out.println("<구구단>");
		for(int i = 1 ; i <= 9 ; i++) {
			System.out.println(num + " X " + i + " = " + num*i);
			//printf를 썼는데 줄을 바꾸고 싶으면, 문자열 마지막에 \n 직접입력
			//\t는 공백을 주되 한 줄로!
			
		}

	}

}
