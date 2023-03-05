package day0216.stringex.sample;

import java.util.Scanner;

public class StackApp {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력 : ");
		int num = s.nextInt();
		StringStack ss = new StringStack(num);
		while(true) {
			System.out.print("문자열 입력 : ");
			String val = s.next();
			if(val.equals("그만")) {
				break;
			}
			if(!ss.push(val)) {
				System.out.println("스택이 다 차서 푸시 불가");
				break;
			}
		}
		System.out.print("스택에 저장된 모든 문자열 팝 : ");
		int len = ss.length();
		for(int i=0; i < len; i++) {
			String str = ss.pop();
			System.out.print(str+" ");
		}
		s.close(); //스캐너 종료
		
	}

}
