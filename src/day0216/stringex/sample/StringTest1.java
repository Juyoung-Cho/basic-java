package day0216.stringex.sample;

public class StringTest1 {
	public static void main(String[] args) {
		
		String s1 = new String("ABC");
		String s2 = new String("ABC");

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		//String equals()는 객체 안에 저장된 문자열을 비교한다.
		
		String s3 = "abc"; //constant pool에 저장
		String s4 = "abc"; 
		
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
	}

}
