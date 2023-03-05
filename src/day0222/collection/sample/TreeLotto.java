package day0222.collection.sample;

import java.util.*;

public class TreeLotto {
	public static void main(String[] args) {
		TreeSet<Integer> lotto = new TreeSet<>();
		for(; lotto.size() < 6;) {
			int num =(int)(Math.random()*45)+1;
			lotto.add(num);
		}
		System.out.println(lotto);
	}

}
