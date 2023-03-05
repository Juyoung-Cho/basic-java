package day0222.collection.sample;
//Iterator : 컬렉션의 요소를 읽어오는 방법을 표준화한 인터페이스
//ListIterator
//Enumeration : Iterator의 구버전
import java.util.*;

public class IteratorEx {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator<String> iter = list.iterator();
		
		while(iter.hasNext()) {//다음 객체가 있는지 체크
			System.out.println(iter.next());//커서가 다음 객체로 넘어가 객체를 꺼내옴.
		}
	}

}
