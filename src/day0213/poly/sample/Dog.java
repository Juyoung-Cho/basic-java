package day0213.poly.sample;

public class Dog extends Animal {
	
	String kind;

	@Override
	public void move() {
		System.out.println("개는 네 발로 뛰어 다닙니다.");
	}

	@Override
	public void sound() {
		System.out.println("왈ㄹ랄왈!!");
	}
	
	

}
