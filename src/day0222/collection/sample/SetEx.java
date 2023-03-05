package day0222.collection.sample;

import java.util.*;

public class SetEx {

	public static void main(String[] args) {
		//String 클래스 equals(), hashCode() 메서드가 오버라이딩이 되어 있어서, 객체가 동일함을 판단내릴 수 있다.
		String[] array = {"1",new String("1"),"2","3","3","3","4"};
		Set<String> set = new HashSet<String>();
		for(String s : array) {
			set.add(s);
		}
		System.out.println(set);
	}

}
