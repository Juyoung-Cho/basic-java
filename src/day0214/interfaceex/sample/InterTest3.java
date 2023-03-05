package day0214.interfaceex.sample;

import java.util.Scanner;

interface Say{
	public void hello();
}
class Korean implements Say{
	@Override
	public void hello() {
		System.out.println("안녕");
	}
}

class English implements Say{
	@Override
	public void hello() {
		System.out.println("Hi");
	}
}

class Etc implements Say{

	@Override
	public void hello() {
		System.out.println("기타언어");
	}
	
}

public class InterTest3 {
	public static void main(String[] args) {
		
		Korean k = new Korean();
		English e = new English();
		Etc et = new Etc();
		
		System.out.print("언어코드를 입력하세요 : ");
		Scanner s = new Scanner(System.in);
		String lang = s.next();
		
		Say say;
		if(lang.equals("en")) {
			say = e;
		}else if(lang.equals("ko")) {
			say = k;
		}else {
			say = et;
		}
		say.hello();
	}

}
