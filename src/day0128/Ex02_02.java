package day0128;

import java.util.Scanner;

//두 개의 값(정수)을 입력받아 더하기,빼기,곱하기,나누기 수행 (Scanner)
public class Ex02_02 {
	public static void main(String[] args) {
		/*입력 : System.in에 입력된 내용을 스캔 
		new Scanner(System.in) 화면으로 부터 입력된 값을 읽어오는 스캐너 객체를 만들었음.
		그에 대해 버튼 필요. 즉, 엔터를 누르는 순간 입력받음.
		next() -> 문자열로 입력받음
		nextInt() -> 정수로 입력받음
		nextBoolean() -> t/f 만 입력받음 */
		
		Scanner s = new Scanner(System.in); //주소값을 기억하고 있는 것임.
		
		System.out.println("a 정수를 입력하세요");
		int a = s.nextInt(); //엔터를 누른 순간 입력한 데이터를 읽어옴.
		System.out.println("b 정수를 입력하세요");
		int b = s.nextInt();
		
		System.out.println(a+"+"+b+"="+(a+b)); 
		System.out.println(a+"-"+b+"="+(a-b)); 
		System.out.println(a+"*"+b+"="+(a*b));
		System.out.println(a+"/"+b+"="+(a/b));
		
	}
}
