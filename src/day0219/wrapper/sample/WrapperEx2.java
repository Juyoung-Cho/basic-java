package day0219.wrapper.sample;
//String -> int
public class WrapperEx2 {
	public static void main(String[] args) {
		//1st way : not recommended
		int i = new Integer("100").intValue();
		//2nd way : parseInt("수",몇 진수-안쓰면10진수생략-) (가장 많이 쓰임)
		//단, 전달되는 문자열이 숫자로만 이루어져 있어야 함.
		int i2 = Integer.parseInt("100");
		//3rd way : valueOf()
		Integer i3 = Integer.valueOf("100");
		
		int i4 = Integer.parseInt("100",2);
		int i5 = Integer.parseInt("100",8);
		int i6 = Integer.parseInt("100",16);
		int i7 = Integer.parseInt("FF",16);
		
		System.out.println("\"100\",2 : "+i4);
		System.out.println("\"100\",8 : "+i5);
		System.out.println("\"100\",16 : "+i6);
		System.out.println("\"FF\",16 : "+i7);
	}

}
