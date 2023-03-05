package day0130.operator.sample;

public class OperEx9 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		boolean c = (a = a +10) == b && b++ == a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
