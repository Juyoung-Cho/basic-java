package day0130.operator.sample;

public class OperEx15 {
	public static void main(String[] args) {
		
		int a = 12; // 00001100
		int b = 2; 
		
		int c = a << b; //00110000
		int d = a >> b; //00000011
		
		System.out.println(c); //48
		System.out.println(d); //3

	}

}
