package day0222.collection.sample;

import java.util.*;

public class LinkedListEx2 {
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<>();
		
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		System.out.println(myList); //[A, B, C]
		
		myList.add(1,"D");
		System.out.println(myList); //[A, D, B, C]
		
		myList.addFirst("O");
		System.out.println(myList); //[O, A, D, B, C]
		
		System.out.println(myList.removeLast()); //C
		System.out.println(myList); //[O, A, D, B]

		
	}

}
