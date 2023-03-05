package day0214.abstractex.sample;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("빠르게 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("높게 접프합니다.");
	}

	@Override
	public void turn() {
		System.out.println("Turn은 불가능");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("중급자 레벨입니다.");
	}

}
