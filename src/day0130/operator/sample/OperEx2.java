package day0130.operator.sample;

import java.util.Scanner;

//산술 연산자를 이용해 총점과 평균을 구하자.
public class OperEx2 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("수학 성적 입력 : ");
		int mathScore = s.nextInt();
		System.out.print("영어 성적 입력 : ");
		int engScore = s.nextInt();
		System.out.print("국어 성적 입력 : ");
		int korScore = s.nextInt();
		
		int total = mathScore + engScore + korScore;
		System.out.println("총점 = " + total);
		
		double avg = total/3.0;
		System.out.println("평균 : " + avg);
		

	}

}
