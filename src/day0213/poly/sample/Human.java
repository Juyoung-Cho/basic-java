package day0213.poly.sample;

public class Human extends Animal {
	
	int money;

	@Override
	public void move() {
		System.out.println("사람은 두발로 걷습니다.");
	}

	@Override
	public void sound() {
		System.out.println("엉엉 ㅠㅠ");
	}
	

}
