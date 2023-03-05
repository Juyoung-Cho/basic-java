package day0226.inner.sample;

public class StaticInner {
	
	int a = 10;
	private int b = 100;
	static int c = 200;
	//static inner class
	static class Inner{
		static int d = 1000;
		public void printData() {
			//System.out.println("int a = "+a); //인스턴스 변수 사용 불가
			//System.out.println("private int b = "+b);
			System.out.println("static int c = "+c);
		}
	}
	
	public static void main(String[] args) {
		//이미 클래스 정보가 로딩 되어 있어서 바로 객체 생성가능
		StaticInner.Inner inner = new StaticInner.Inner();
		inner.printData();

	}

}
