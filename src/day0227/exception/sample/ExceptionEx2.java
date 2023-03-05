package day0227.exception.sample;

public class ExceptionEx2 {
	//받아온 값의 첫 번째 글자만 잘라낸다.
	public void setData(String n)throws NumberFormatException {
		if(n.length() >= 1) {
			String str = n.substring(0,1);
			printData(str);
		}
	}
	//현재 메서드는 try-catch가 없어서 예외 처리X
	//예외가 발생하면 호출한 곳으로 되던져서 그곳에서 처리한다.
	public void printData(String n) throws NumberFormatException {
		int dan = Integer.parseInt(n);
		System.out.println(dan+"단");
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n",dan,i,(dan*i));
		}
	}
	public static void main(String[] args) {
		ExceptionEx2 e = new ExceptionEx2();
		try {
		e.setData("test");
		}catch(NumberFormatException ne) {
			System.err.println(ne.getMessage());
			System.err.println("예외 처리함");
		}
		System.out.println("program end");

	}

}
