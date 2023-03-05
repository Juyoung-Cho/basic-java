package day0227.stream.sample;

import java.util.*;
import java.util.stream.Stream;

public class StringListStream {
	public static void main(String[] args) {
		
		List<String> sList = new ArrayList<>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s -> System.out.print(s+" "));
		System.out.println();
		
		sList.stream().sorted().forEach(s -> System.out.print(s+" "));
				

	}

}
