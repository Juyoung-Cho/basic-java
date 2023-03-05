package day0222.collection.sample;

import java.util.*;

public class LinkedListEx {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		long start; //nano단위의 시간값
		long end;
		
		start = System.nanoTime();
		for(int i = 0; i<10000; i++) {
			list1.add(0,"a");
		}
		end = System.nanoTime();
		
		System.out.println("ArrayList 걸린 시간 : "+(end - start));
		
		start = System.nanoTime();
		for(int i = 0; i<10000; i++) {
			list2.add(0,"a");
		}
		end = System.nanoTime();
		
		System.out.println("LinkedList 걸린 시간 : "+(end - start));

	}

}
