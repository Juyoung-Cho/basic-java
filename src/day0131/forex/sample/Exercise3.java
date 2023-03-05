package day0131.forex.sample;

//구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하자.
public class Exercise3 {
	public static void main(String[] args) {
		
		int dan;
		int times;
		
		for(dan = 1; dan <= 9; dan++) {
			for(times = 1; times <= 9; times++) {
				if(dan < times ) {
					break;
				}//if
				System.out.println(dan + " X " + times + " = " + (dan*times));
			}//inner for
		}//outer for
	}

}
