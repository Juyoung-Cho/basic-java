package day0130.operator.sample;

//증감 연산자 (단항 연산자)
public class OperEx5 {
	public static void main(String[] args) {
		
		int i = 10;
		
		System.out.println(i+1); //11
		System.out.println(i); //10
		System.out.println(++i); //11
		System.out.println(i); //11
		
		System.out.println(i++); //11 i는 12가 되었지만, ++이 가장 마지막에 실행되므로 출력은 11
		System.out.println(i); //12

	}

}
