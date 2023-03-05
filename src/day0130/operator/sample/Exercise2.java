package day0130.operator.sample;

import java.util.Scanner;

//해수면에서 10m씩 내려갈 때마다 수온이 0.7도씩 내려간다고 가정할 때,
//수심을 입력하면 수온을 계산하는 프로그램을 작성하세요.
//단 해수면의 온도는 20도입니다.
public class Exercise2 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("수심을 입력하세요 => ");
		int depth = s.nextInt();
		
		double temperature = 20 - (depth/10*0.7);
		System.out.printf("수온 : %.1f",temperature);

	}

}
