package day0131.whileex.sample;

public class DoWhileEx1 {
	public static void main(String[] args) {
		int i = 10;
		//do 안에 있는 수행문은 false라도 무조건 한번은 실행된다.
		do {
			System.out.println("실행");
		}while(i < 5);

	}

}
