package day0209.oopex.sample;

public class OverloadingTest {
	
	int add(int i, int j) {
		return i + j;
	} //1
	long add(long i, long j) {
		return i + j;
	} //2
	double add(double a, double b) {
		return a + b;
	} //3
	
	public static void main(String[] args) {
		OverloadingTest over = new OverloadingTest();
		over.add(3.14, 10.03); //3실행
		over.add(3.15, 100); //3실행(뒤가 정수라도 없으니까 자동으로 실수로)

	}

}
