package day0205.oopex.var;

public class MethodEx {
	
	static void run() {
		MethodEx.first();
	}
	static void first() {
		second(); //class명이나 참조변수가 없다면 같은 class의 멤버 사용
	}
	static void second() {
		System.out.println("출력");
	}
	

	public static void main(String[] args) {
		run();
	}

}
