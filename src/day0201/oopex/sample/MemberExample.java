package day0201.oopex.sample;

import java.util.Scanner;

public class MemberExample {
	public static void main(String[] args) {
		
		Member m = new Member();
		
		m.name="조주영";
		m.id = "cho";
		m.password = "juyoung";
		m.age = 30;

		Scanner s = new Scanner(System.in);
		
		System.out.print("아이디 입력 => ");
		String id = s.next();
		System.out.print("비밀번호 입력 => ");
		String password = s.next();
		
		boolean login = m.login(id, password);
		
		if(login) {
			System.out.println("로그인 되었습니다.");
		}else {
			System.out.println("아이디나 패스워드가 올바르지 않습니다.");
		}
	}

}
