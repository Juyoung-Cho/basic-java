package day0216.stringex.sample;

public class StringTest3 {
	public static void main(String[] args) {
		//공백 숫자 대문자 소문자 한글
		String a = "aaa";
		String b = "bbb";
		
		int i = a.compareTo(b); //문자열의 크기를 비교(첫글자씩)
		int i2 = b.compareTo(a);
		int i3 = a.compareTo("aaa");
		
		System.out.println(i); //-1 앞이 매개변수 전달된 것보다 사전 상 작을 때 음수
		System.out.println(i2);//1 앞이 매개변수로 전달 된 것보다 사전 상 클 때 양수
		System.out.println(i3);//0 같을 때 0리턴
		
		int result = "abcd".compareTo("abcz");//d와 z 4-26 = -22
		if(result == 0) {
			System.out.println("\"abcd\"와 \"abcz\"는 같습니다."); //\붙이면 "도 출력
		}else if (result < 0) {
			System.out.println("\"abcd\"가 \"abcz\"보다 작습니다.");
		}else if(result > 0) {
			System.out.println("\"abcd\"가 \"abcz\"보다 큽니다.");
		}
	}

}
