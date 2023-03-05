package day0131.forex.sample;

//for문을 이용해 1~100사이의 값 중 3과 7의 공배수를 구하고
//그 중 최소 공배수도 출력
public class ForEx4 {
	public static void main(String[] args) {
		
		int num = 0;
		System.out.println("3과 7의 공배수");
		for(int i = 1 ; i <= 100 ; i++) {
			if(i%3 == 0 && i%7 == 0) {
				System.out.println(i);
				if(num == 0) {
					num = i;
				}
			}
			
		}//for 종료
		System.out.println("최소공배수 : "+num);
		

	}

}
