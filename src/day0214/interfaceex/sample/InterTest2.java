package day0214.interfaceex.sample;

interface InterEx1{
	public int getA();
}

interface InterEx2{
	public int getA();
}
//상속받은 추상 메서드를 오버라이딩 하면 안됨. (받은 게 인터페이스이므로)
interface InterEx3 extends InterEx1, InterEx2{
	public int getData(); //상속받은 추상 메서드가 이름과 매개변수가 같으므로 한 개로 인식함.
}

public class InterTest2 implements InterEx3{
	
	int a = 100;
	
	@Override
	public int getA() {
		return a;
	}

	@Override
	public int getData() {
		return a + 10;
	}
	public static void main(String[] args) {
		InterTest2 it = new InterTest2();
		InterEx1 i1 = it; //super클래스므로 이렇게 선언 가능. 그러나 getA()만 사용가능.
		InterEx2 i2 = it;
		InterEx3 i3 = it;
		System.out.println(i1.getA());
		System.out.println(i2.getA());
		System.out.println(i3.getA());
		System.out.println(i3.getData());

	}

	

}
