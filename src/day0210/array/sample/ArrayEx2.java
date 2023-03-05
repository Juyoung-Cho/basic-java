package day0210.array.sample;


//학생의 성적을 전달받아 배열에 저장하고 제일 높은 성적을 출력
//80, 90, 70, 60, 75
public class ArrayEx2 {
	public static void main(String[] args) {
		int[] grades = {80,90,70,60,75};
		int max = grades[0];
		int min = grades[0];
		int sum = 0;
		
		for(int i = 0 ; i < grades.length ; i++) {
			if(max < grades[i]) {
				max = grades[i];
			}
			if(min > grades[i]) {
				min = grades[i];
			}
			sum += grades[i];
		}
		
		
		int avg = sum / grades.length; //double로 바꿔야 할 때도 있다.
		System.out.println("최고 성적 : " + max);
		System.out.println("최저 성적 : " + min);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
		

	}

}
