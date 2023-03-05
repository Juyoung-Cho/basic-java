package day0214.abstractex.sample;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("엄청 빠르게 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("아주 높게 점프합니다.");
	}

	@Override
	public void turn() {
		System.out.println("한 바퀴 턴합니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("고급자 레벨입니다.");
	}

}
