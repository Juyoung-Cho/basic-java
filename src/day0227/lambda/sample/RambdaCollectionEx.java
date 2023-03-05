package day0227.lambda.sample;

import java.util.*;

public class RambdaCollectionEx {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		list.replaceAll(i->i+"A"); //apply메서드 구현
		
		System.out.println(list);

	}

}
