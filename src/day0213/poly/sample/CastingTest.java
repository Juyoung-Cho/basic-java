package day0213.poly.sample;

public class CastingTest {
	public static void main(String[] args) {
		
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; //업캐스팅
		//car.water();  //업캐스팅 자체는 문제 없으나 sub의 메서드를 사용할 순 없다.
		fe2 = (FireEngine)car; //셋 모두 동일한 주소값을 공유. 다 같은 객체.
		fe2.water();

	}

}
