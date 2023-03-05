package day0130.operator.sample;

//534자루의 연필을 30명의 학생들에게 똑같은 개수로 나누어 줄때
//한 명당 몇 개를 가질 수 있고, 최종 몇 개가 남는지 구하세요.
public class Exercise1 {
	public static void main(String[] args) {
		
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = pencils/students;
		int rest = pencils%students;
		
		System.out.printf("한 명당 %d개씩 가지고 %d개 남는다",pencilsPerStudent,rest);

	}

}
