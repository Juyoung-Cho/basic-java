package day0219.wrapper.sample;
//오토박싱과 언박싱은 자동으로 (명시는 해도 되고, 안해도 됨)
public class AutoBoxingEx {
	public static void main(String[] args) {
		int i = 10;
		//기본형을 참조형으로 형변환(형변환 생략가능)
		Integer intg = i;//실제 작동 : Integer intg = Integer.valueOf(i);
		Object o = i; // 실제 작동 : Object o = Integer.valueOf(i)
		
		Long lng = 100L; // Long lng = new Long(100L);
		
		int i2 = intg + 10; //참조형과 기본형 간의 연산 가능
		long l = lng + intg; //wrapper 객체간의 연산 가능
		//unboxing
		int i3 = intg; //실제 작동 : int i3 = intg.intValue();
		
		int i4 = 100;
		long l4 = i4;
		
		Integer i5 = 100;
		// Long l5 = i4; //error
		// Long l6 = i5; //error
		// 기본형 <-> 참조형 형변환은
		// 같은 타입을 다루는 wrapper클래스와 기본형 간에만 가능.
		
	}

}
