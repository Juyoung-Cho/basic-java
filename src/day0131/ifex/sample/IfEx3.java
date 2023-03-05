package day0131.ifex.sample;

import java.util.Scanner;

//두 개의 정수를 입력받아 두 숫자의 차를 구하시오.
//단, 음수가 나오면 안됨.
public class IfEx3 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("첫 번째 수를 입력하세요. => ");
		int a = s.nextInt();
		System.out.print("두 번째 수를 입력하세요. => ");
		int b = s.nextInt();
		int diff = 0;
		
		if(a >= b) {
			diff = a - b;
		}else {
			diff = b - a;
		}
		
		System.out.printf("두 수의 차는 %d입니다.",diff);
	}

}
