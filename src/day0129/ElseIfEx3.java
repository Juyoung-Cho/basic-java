package day0129;

import java.util.Scanner;

public class ElseIfEx3 {
	public static void main(String[] args) {
		
		int no;
		int m; //중간
		int f; //기말
		double avg; //평균
		String grade; //학점
		
		Scanner s = new Scanner(System.in);
		System.out.println("학번을 입력하세요");
		no = s.nextInt();
		System.out.println("중간고사 점수를 입력하세요");
		m = s.nextInt();
		System.out.println("기말고사 점수를 입력하세요");
		f = s.nextInt();
		
		avg = (double)(m + f) / 2;
		
		if(avg>=80) {
			grade = "A";
		}else if(avg>=60) {
			grade = "B";
		}else {
			grade = "F";
		}
		
		System.out.printf("%d학생의 평균은 %.2f이고, 학점은 %s입니다.",no,avg,grade);

	}

}
