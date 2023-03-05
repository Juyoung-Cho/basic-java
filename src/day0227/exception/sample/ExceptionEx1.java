package day0227.exception.sample;

public class ExceptionEx1 {
	public static void main(String[] args) {
		
		int[] arr = new int[3];
		
		for(int i =0; i <= arr.length; i++) {
			try {
				arr[i] = i;
				System.out.println(arr[i]);
			}
			catch(ArrayIndexOutOfBoundsException ae) {
				System.err.println(ae.getMessage());
				ae.printStackTrace();//예외 추적 메서드
			}finally {
				System.out.println("finally"+i);
			}
		}
		System.out.println("프로그램 종료");

	}

}
