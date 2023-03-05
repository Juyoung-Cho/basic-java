package day0131.forex.sample;

//1~10사이 홀수만 출력
public class ContinueBreakEx1 {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			if(i%2 == 0) {
				continue;
				//break;
			}
			System.out.println(i);
		}
		
	}

}
