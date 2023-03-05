package day0130.operator.sample;

public class OperEx3 {
	public static void main(String[] args) {
		
		int apple = 1; //사과 한 개 = 1
		double piece = 0.1; // 한조각을 0.1 (총 10조각)
		int number = 7; //먹은 조각 갯수
		
		double result = apple - piece*number;
		
		System.out.println("남은 사과는 " + result + "입니다."); 
		//0.2999999(부동 소수점 방식) 근사치로 표현.
		
		//정확한 계산이 필요하다면 정수로 바꿔서 계산 후 다시 소수점을 붙인다.
		int apple1 = 1;
		int totalpieces = apple1*10;
		int number1 = 7;
		
		int temp = totalpieces - number1;
		double result1 = temp/10.0;
		System.out.println("남은 사과는 " + result1 + "입니다.");
		
		
		

	}

}
