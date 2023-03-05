package day0131.ifex.sample;

import java.util.Scanner;

//성별을 입력받아, 남성='M', 여성='F' gender변수에 저장하고
//F인 경우 여성입니다. 아닌 경우 남성입니다.
public class IfEx2 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("성별을 입력하세요. => ");
		char gender = s.next().charAt(0); //문자열로 받아와서 첫글자만 char타입으로 꺼냄.
		
		if(gender == 'F') {
			System.out.println("여성입니다.");
		}else if(gender =='M') {
			System.out.println("남성입니다.");
		}else {
			System.out.println("다시 입력하세요.");
		}
		
		System.out.println("프로그램 종료");

	}

}
