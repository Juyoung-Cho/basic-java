package day0130.operator.sample;

//나누기
public class OperEx4 {
	public static void main(String[] args) {
		
		int num1 = 5;
		
		System.out.println(num1/0); //exception 정수는 0으로 나누면 안됨.
		System.out.println(num1%0); //exception
		
		System.out.println(num1 / 0.0); //infinity 실수를 0으로 나누면 무한대.
		System.out.println(num1 % 0.0); //NaN (Not a Number)
	}

}
