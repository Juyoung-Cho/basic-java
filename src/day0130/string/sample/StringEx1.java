package day0130.string.sample;

public class StringEx1 {
	public static void main(String[] args) {
		
		String s = "문자열 표현";
		System.out.println(s);
		
		//문자열 결합 : +연산자 사용(다른 연산자는 사용불가)
		//+연산자는 문자열 우선순위, 즉 String으로 바꿔서 계산함.
		String name = "ja" + "va"; //java
		System.out.println(name);
		
		String blank = " "; //공백도 문자열로 인식
		String empty = ""; //빈 문자열 (이것도 문자열)
		
		String a = 7 + " ";
		String b = " " + 7;
		String c = 7 + "";
		String d = "" + 7;
		//명시해서 형변환은 숫자를 저장하는 데이터 타입만 가능. String 불가능.
		//따라서, int에 빈문자열을 더해 String으로 바꿀 수 있다.
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		String e = "" + 7 + 7;
		System.out.println(e); //77
		String f = 7 + 7 + "";
		System.out.println(f); //14
		
	}
}
