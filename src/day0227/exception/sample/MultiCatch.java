package day0227.exception.sample;

public class MultiCatch {
	public static void main(String[] args) {
		try {
		int a = Integer.parseInt(args[0]);
		int result = 100/a;
		System.out.println("result : "+result);
		}catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println("argument값을 넣어주세요.");
		}catch(NumberFormatException ne) {
			System.out.println("숫자를 넣어주세요.");
		}catch(ArithmeticException ae) {
			System.out.println("0으로 나눌 수 없습니다.");
		}catch(Exception e) {
			System.out.println("예외가 발생하였습니다.");
		}//super클래스를 사용하고자 한다면, 제일 아래에 적어주자.
		System.out.println("프로그램 종료");

	}

}
