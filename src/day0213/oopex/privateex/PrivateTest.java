package day0213.oopex.privateex;

class Parent{
	//priavte 메서드는 상속은 되지만 감춰진 상태로 가지고 있음.
	//오버라이딩 할 수 없음.
	private void m1() {
		System.out.println("Parent.1()");
	}
	public void m2() {
		System.out.println("Parent.m2()");
		m1();
	}
	
}
class Child extends Parent{
	public void m1() {
		System.out.println("Child.m1()");
	}
}

public class PrivateTest {
	public static void main(String[] args) {
		Child c = new Child();
		c.m2();
		System.out.println("==================");
		c.m1();

	}

}
