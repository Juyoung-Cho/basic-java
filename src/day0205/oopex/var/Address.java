package day0205.oopex.var;

public class Address {
	String postCode;
	String area1;
	String area2;
	//생성자 : 접근제어자 클래스명(매개변수..){//인스턴스 변수에 값 저장;}
	Address(){}
	Address(String p, String a1, String a2){
		postCode = p;
		area1 = a1;
		area2 = a2;
	}
	//Address a = new Address ("12345","Seoul","jongro");
	
	//Object클래스부터 만들어진 toString메서드를 고쳐서 사용함.
	//출력문(print)에서 참조변수(주소값)를 출력. 가지고 있는 주소값을 출력X toString메서드 호출하게 되어있음.
	public String toString(){
		return postCode + " " + area1 + " " + area2;
	}

}
