package com.test02;

public class AccountTest {
	public static void main(String[] args) {
		Account account = new Account ("441-0290-1203", 500000, 7.3);
		System.out.println
			("계좌정보 : " + account.account + " 현재잔액 : " + account.balance);
		account.deposit(20000);
		System.out.println
			("계좌정보 : " + account.account + " 현재잔액 : " + account.balance);
		System.out.printf("이자 : %.1f ",account.calculateInterest());
		

	}

}
