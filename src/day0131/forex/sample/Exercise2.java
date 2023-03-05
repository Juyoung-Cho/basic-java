package day0131.forex.sample;

//구구단을 짝수 단만 출력하기
public class Exercise2 {

	public static void main(String[] args) {
		
		int dan;
		int times;
		
		for(dan = 1; dan <= 9; dan++) {
			if(dan % 2 != 0) {
				continue;
			}
			for(times = 1; times <= 9 ; times++) {
				System.out.println(dan + " X " + times + " = " + (dan*times));
			}
		}

	}

}
