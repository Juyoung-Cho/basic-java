package day0131.whileex.sample;

public class WhileEx1 {
	public static void main(String[] args) {
		
		int num = 1; //시작할 숫자
		int sum = 0;
		
		//조건식 : 반복이 끝나는 지점
		while(num <= 10) {
			sum += num;
			num++;
		}
		System.out.println("합은 "+sum+"입니다.");

	}

}
