package day0131.ifex.sample;

import java.util.Scanner;

//성적을 입력하면 성적에 맞는 학점을 출력
//90~100 : "A", 80~89 : "B", 70~79 : "C" 그 외 F
public class IfEx5 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("성적을 입력하세요. => ");
		int score = s.nextInt();
		String grade;
		
		if(score >= 90) {
			grade = "A";
			if(score <= 93) {
				grade += "-";
			}
			if(score >= 98) {
				grade += "+";
			}
		}else if(score >= 80) {
			grade = "B";
		}else if(score >= 70) {
			grade = "C";
		}else {
			grade = "F";
		}
		
		System.out.println("학점은 " + grade + "입니다.");

	}

}
