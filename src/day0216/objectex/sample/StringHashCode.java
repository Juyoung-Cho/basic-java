package day0216.objectex.sample;

public class StringHashCode {
	public static void main(String[] args) {
		
		String s1 = "AAA";
		String s2 = new String("AAA");
		String s3 = "CCC";
		
		//String 클래스는 저장되어있는 값이 같으면 같은 주소값이 리턴되도록 오버라이딩 되어있다.
		System.out.println(s1.hashCode()); 
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		System.out.println(System.identityHashCode(s1)); //실제 주소값을 리턴
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));

	}

}
