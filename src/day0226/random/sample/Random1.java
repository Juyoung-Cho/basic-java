package day0226.random.sample;

import java.util.Random;

public class Random1 {
	public static void main(String[] args) {
		
		int num1 = (int)(Math.random()*100)+1;
		System.out.println(num1);
		
		Random r = new Random();
		int num2 = r.nextInt(100);//범위
		System.out.println(num2);

	}

}
