package day0131.whileex.sample;

import java.util.Scanner;
//1,2,3을 입력시 입력값을 출력 후 반복, 그 외 나머지 값인 경우 반복 종료
public class WhileEx2 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		boolean stop = false;
		
		while(!stop) {
			
			System.out.print("숫자를 입력하세요. => ");
			int num = s.nextInt();
			
			if(num == 1) {
				System.out.println("1을 입력.");
			}else if(num == 2) {
				System.out.println("2를 입력");
			}else if(num == 3) {
				System.out.println("3을 입력");
			}else {
				System.out.println("잘못 입력");
				stop = true;
			}
		}
		System.out.println("프로그램 종료");

	}

}
