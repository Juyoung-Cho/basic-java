package day0130.operator.sample;

//a가 저장된 값이 짝수라면 "짝수", 홀수라면 "홀수"출력
public class OperEx12 {
	public static void main(String[] args) {
		
		int a = 10;
		
		String str = a % 2 == 0 ? "짝수" : "홀수";
		
		System.out.printf("%d는(은) %s입니다.",a,str);
	}

}
