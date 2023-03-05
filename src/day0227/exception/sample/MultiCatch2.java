package day0227.exception.sample;

public class MultiCatch2 {
	public static void main(String[] args) {
		try {
		int a = Integer.parseInt(args[0]);
		int result = 100/a;
		System.out.println("result : "+result);
		}catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println("argument값을 넣어주세요.");
		}catch(NumberFormatException | ArithmeticException ae) {
			System.out.println("0을 제외한 숫자를 넣어주세요.");
		}//|로 catch를 동시에 작성
		System.out.println("프로그램 종료");

	}

}
