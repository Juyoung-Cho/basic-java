package day0201.oopex.sample;

public class Arithmetic {
	
	int add (int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	int subtract (int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
	
	int multifly (int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
	
	double divide (double num1, double num2) {
		double result;
		if(num2 != 0.0) {
			result = num1 / num2;
			
		}else {
			System.out.println("0.0으로 나누면 안됩니다.");
			result = 0;
		}
		return result;
		
	}

}
