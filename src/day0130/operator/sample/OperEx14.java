package day0130.operator.sample;

public class OperEx14 {

	public static void main(String[] args) {
		
		int a = 10; // 00001010
		int b = 7; //  00000111
		
		System.out.println(a & b); //00000010
		System.out.println(a | b); //00001111
		System.out.println(a ^ b); //00001101
		System.out.println(~a); //11110101

	}

}
