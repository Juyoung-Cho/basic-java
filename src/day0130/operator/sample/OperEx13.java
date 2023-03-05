package day0130.operator.sample;

public class OperEx13 {

	public static void main(String[] args) {
		int a = 14;
		int b = 15;
		String s = (a != b) ? (a > b) ? "a가 더 큼" : "b가 더 큼" : "a와 b는 같음";
		
		System.out.println(s);

	}

}
