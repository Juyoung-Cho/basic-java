package day0210.array.sample;
//랜덤값(난수) : (int)(Math.random()*범위) : 0 ~ 범위-1
//만약 1부터 시작하길 원하면 뒤에 +1
public class ArrayEx3 {

	public static void main(String[] args) {
		String[] food = {"치킨","짜장면","김치찌개","크로플","피자"};
		int number = (int)(Math.random()*food.length);
		
		System.out.println(food[number]);

	}

}