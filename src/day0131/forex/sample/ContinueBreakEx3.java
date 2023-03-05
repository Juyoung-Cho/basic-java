package day0131.forex.sample;

//1부터 하나씩 더했을 때 그 합이 500이 넘는 자연수를 출력
public class ContinueBreakEx3 {
	public static void main(String[] args) {
		int sum = 0;
		int num;
		for(num = 1;;num++) {
			sum += num;
			if(sum >= 500) {
				break;
			}
		}
		
		System.out.println(num);
		System.out.println("sum" + sum);
	}

}
