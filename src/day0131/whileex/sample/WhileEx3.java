package day0131.whileex.sample;

//1~50 숫자 중 4의 배수만 더해라.
public class WhileEx3 {
	public static void main(String[] args) {
		
		int num = 1; //시작할 숫자
		int sum = 0;
		
		//조건식 : 반복이 끝나는 지점
		while(num <= 50) {
			if(num % 4 == 0) {
				sum += num;
			}
			num++;
			
		}
		System.out.println("합은 "+sum+"입니다.");

	}


	}


