package day0227.stream.sample;

import java.util.*;

public class IntArrayStream {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		int sumVal = Arrays.stream(arr).sum();
		int count = (int)Arrays.stream(arr).count();
		
		
		System.out.println(sumVal);
		System.out.println(count);
		
		int sumVal2 = Arrays.stream(arr).reduce(0, (a,b)->a+b);
		System.out.println(sumVal2);

	}

}
