package day0214.interfaceex.sample;

interface Inter1{
	int A = 100; //public final 생략 가능
	int getA(); //abstract 생략 가능
}

public class InterTest implements Inter1 {
	
	@Override
	public int getA() {
		return A;
	}
	
	public static void main(String[] args) {
		Inter1 it = new InterTest();
		System.out.println("getA() : "+ it.getA());

	}

	

}
