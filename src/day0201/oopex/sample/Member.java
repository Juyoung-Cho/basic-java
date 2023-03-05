package day0201.oopex.sample;

public class Member {
	String name;
	String id;
	String password;
	int age;
	// == : 주소값 비교.
	//equals() : 문자열의 내용을 비교
	boolean login(String a, String b) {
		return (id.equals(a) && password.equals(b));
	}
	
	void logout(String a) {
		System.out.println(a + "님이 로그아웃 되었습니다.");
	}

}
