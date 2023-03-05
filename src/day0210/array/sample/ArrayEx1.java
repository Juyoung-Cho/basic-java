package day0210.array.sample;

public class ArrayEx1 {

	public static void main(String[] args) {
		char[] c_array = new char[4];
		//배열은 한 번 만들어지면 크기가 고정됨. 크기를 넘어서는 인덱스는 사용불가.
		c_array[0] = 'j';
		c_array[1] = 'a';
		c_array[2] = 'v';
		c_array[3] = 'a';
		System.out.println(c_array[3]);
		//array.length : 배열에 저장된 데이터의 갯수
		for(int i = 0 ; i < c_array.length ; i++) {
			System.out.println(c_array[i]);
		}
		
		int[] arr1 = {1,2,3,4,5}; //선언과 생성을 한 문장에서 해야 함. 선언과 동시에 초기화.
		//int[] a;
		//a = {1,2,3,4,5};
		//위와 같이 선언과 생성을 동시에 하지 않으면 에러 발생. 
		
		int[] arr2 = new int[] {1,2,3,4,5};
		
		

	}

}
