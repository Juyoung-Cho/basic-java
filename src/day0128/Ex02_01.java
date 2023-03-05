package day0128;
//100과 50의 더하기, 뺴기, 곱하기, 나누기 수행
public class Ex02_01 {
	public static void main(String[] args) {
		
		int a = 100;
		int b = 50;
		//"문자열(String)" =>의미 없는 단순 글자
		// 정수 + 정수 => 정수 100 + 50 = 150
		// 정수 + 문자열 => 문자열(이어 쓰기) 100 + "+" = "100+"
		// 문자열을 +만 가능
		System.out.println(a+"+"+b+"="+(a+b)); //println : 화면(console)창에 ()내용을 출력하겠다.
		System.out.println(a+"-"+b+"="+(a-b)); 
		System.out.println(a+"*"+b+"="+(a*b));
		System.out.println(a+"/"+b+"="+(a/b));

	}
}
