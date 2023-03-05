package day0210.array.sample;
//향상된 for문 : 집합데이터(배열, 컬렉션)에 저장된 데이터들을 처음부터 끝까지 꺼내올 때 사용
public class ArrayForEx {
	public static void main(String[] args) {
		//for( 변수 선언 : 집합데이터) { 수행문; }
		int[] arr1 = {1,2,3,4,5,6,7};
		for( int i : arr1 ) {
			System.out.println(i);
		}
		
		String [] s1 = {"aa","bb","cc"};
		for(String s : s1) {
			System.out.println(s);
		}
		

	}

}
