package day0222.collection.sample;

import java.util.*;

public class TreeSetEx1 {
	public static void main(String[] args) {
		int[] point = {12,24,33,21,2,59,100};
		
		TreeSet<Integer> tree = new TreeSet<>();
		for(int i : point) {
			tree.add(i);
		}
		
		System.out.println(tree);
		System.out.println(tree.headSet(50)); //num(50)보다 작은 수들만 가져옴
		System.out.println(tree.tailSet(50)); //num(50)보다 큰 수들만 가져옴
		
	}

}
