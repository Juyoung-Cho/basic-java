package day0227.lambda.sample;
//추상메서드가 하나만 있는 인터페이스
@FunctionalInterface //이 어노테이션을 붙였을 때, 에러가 나지 않았으니 람다를 적용해 구현할 수 있다.
public interface MyNumber {
	int getMax(int i, int j);
}
