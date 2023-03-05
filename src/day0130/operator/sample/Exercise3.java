package day0130.operator.sample;

import java.util.Scanner;

//속도와 시간을 입력하면
//자동차의 주행 거리를 구하는 프로그램을 작성하세요.
public class Exercise3 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("속도를 입력하세요 => ");
		int kmh = s.nextInt();
		System.out.print("시간을 입력하세요 => ");
		int time = s.nextInt();
		
		System.out.printf("주행 거리(km)는 %dkm입니다.",kmh*time);
		

	}

}
