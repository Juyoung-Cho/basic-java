package day0226.inner.sample;

public class LocalInner {
	
	int a = 100; //멤버 변수
	public void innerTest(int k) {
		int b = 200;
		final int c = k;
		
		class Inner{
			public void printData() {
				System.out.println("a : "+a);
				System.out.println("b : "+b);
				System.out.println("c : "+c);
				
				a = 200;
				System.out.println("a : "+a);
//				b = 300; //local inner class에서 지역변수사용하면 상수가 된다. 따라서 새로운 값 저장 불가.
//				System.out.println("b : "+b);
			}
		}
		Inner i = new Inner();
		i.printData();
	}
	public static void main(String[] args) {
		LocalInner local = new LocalInner();
		local.innerTest(1000);
	}

}
