package day0210.array.sample;

import java.util.Arrays;

public class ArrayCopyEx2 {

	public static void main(String[] args) {
		//java.util.Arrays : 배열을 다루는데 필요한 기능을 가지고 있는 클래스
		//모든 메서드는 static메서드 (Arrays.메서드명)
		//Arrays.copyOf() : 배열 전체 복사 0번자리부터 복사.
		//Arrays.copyOfRange() : 배열의 일부를 복사해 새로운 배열을 만든다.
		
		int[] arr = {0,1,2,3,4};
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		for(int i : arr2) {
			System.out.print(i + " ");
		}
		System.out.println();
		int[] arr3 = Arrays.copyOf(arr, 3);
		for(int i : arr3) {
			System.out.print(i + ",");
		}
		System.out.println();
		int[] arr4 = Arrays.copyOf(arr, 7);
		for(int i : arr4) {
			System.out.print(i + ",");
		}
		System.out.println();
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4); //마지막인덱스는 포함 안됨. 즉,2와3만 복사.
		for(int i : arr5) {
			System.out.print(i + ",");
		}
		System.out.println();
		int[] arr6 = Arrays.copyOfRange(arr,0, 7);
		for(int i : arr6) {
			System.out.print(i + ",");
		}
	}

}
