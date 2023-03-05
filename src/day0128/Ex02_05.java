package day0128;

import java.util.Scanner;

//1부터 입력한 값(짝수)까지의 합을 출력하세요.
//(1+마지막 정수)*(마지막 정수/2)
public class Ex02_05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("짝수를 입력하시오 => ");
		int a = s.nextInt();
		int b = (a+1)*(a/2);
		System.out.println(b);
		System.out.printf("1부터 %d까지의 합 : %d",a,b); //%d, %s 등 ("서식",값)
		System.out.println(); //안에 내용이 없으니, 줄만 바꿈.
/*연산 값처리 원칙
  같은 종류끼리만 계산 가능 => 결과물도 같은 종류
  */
	}

}
