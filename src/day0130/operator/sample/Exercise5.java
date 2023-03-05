package day0130.operator.sample;

import java.util.Scanner;

//BMI구하기
//몸무게와 신장을 입력하면
//BMI = 몸무게(kg) / 신장(m)의 제곱
//몸무게는 int, 신장은 double, bmi는 정수로 출력
public class Exercise5 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("몸무게(kg)를 입력하세요 => ");
		int weight = s.nextInt();
		System.out.print("키(m)를 입력하세요 => ");
		double height = s.nextDouble();
		
		int bmi = (int)(weight/(height*height));
		System.out.printf("BMI는 %d입니다.", bmi);

	}

}
