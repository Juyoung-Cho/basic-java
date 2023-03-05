package day0210.array.sample;

public class ArrayCopyEx1 {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = new int[10];
		
		System.arraycopy(arr1, 0, arr2, 3, 5); //객체라면 주소값을 복사
		for(int a : arr2) {
			System.out.print(a + "\t");
		}
	}

}
