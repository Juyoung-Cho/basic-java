package day0131.whileex.sample;

import java.util.Scanner;

//예금, 출금, 조회, 종료 기능을 제공하는 프로그램을 작성
public class WhileEx4 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		boolean stop = false;
		int balance = 0;
		
		while(!stop) {
			System.out.println("1.예금 2.출금 3.조회 4.종료");
			System.out.print("숫자를 입력하세요. => ");
			int menu = s.nextInt();
			
			if(menu == 1) {
				System.out.print("예금액을 입력 => ");
				int inmoney = s.nextInt();
				balance += inmoney;
			}else if(menu == 2) {
				System.out.print("출금액을 입력 => ");
				int outmoney = s.nextInt();
				if ((balance - outmoney) >= 0) {
				balance -= outmoney;
				}else {
					System.out.println("잔액 부족");
				}
			}else if(menu == 3) {
				System.out.println("계좌 잔액 : " + balance);
			}else if(menu == 4){
				System.out.println("프로그램 종료");
				stop = true;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}

	}

}
