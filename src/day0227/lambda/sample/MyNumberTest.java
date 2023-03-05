package day0227.lambda.sample;

public class MyNumberTest {
	public static void main(String[] args) {
		MyNumber max = (i,j) -> i >= j ? i : j; //MyNumber 구현 객체 생성
		System.out.println(max.getMax(10, 20));
		

	}

}
