package day0210.array.sample;

import java.util.Arrays;

public class LottoEx {
	public static void main(String[] args) {
		int[] ball = new int[54];
		
		for(int i = 0 ; i < ball.length; i++) {
			ball[i]=i+1;
		}
		int temp = 0;
		int j = 0;
		for(int i = 0 ; i < 6; i++) {
			j = (int)(Math.random()*54);
			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;
		}
		int [] lotto = new int[6];
		for(int i = 0 ; i < 6 ; i++) {
			lotto[i] = ball[i];
		}
		Arrays.sort(lotto);;
		System.out.println(Arrays.toString(lotto));

	}

}
