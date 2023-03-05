package day0130.operator.sample;

import java.util.Scanner;

//두 개의 정수를 입력받아 a,b에 저장하고, 둘 중 더 큰수를 출력한다. 만약 같다면 같다고 출력한다.
public class OperEx8 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력해주세요. : ");
		int a = s.nextInt();
		System.out.print("두 번째 정수를 입력해주세요. : ");
		int b = s.nextInt();
		
		
		if(a>b) {
			System.out.println("큰 수는 "+a);
		}else if(a<b) {
			System.out.println("큰 수는 "+b);
		}else {
			System.out.println("같다");
		}
		
		

	}

}
