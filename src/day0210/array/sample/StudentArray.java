package day0210.array.sample;

public class StudentArray {
	public static void main(String[] args) {
		//Student[] stu = {new Student(1001,"James", ```}; 로 한번에 생성 가능
		Student[] stu = new Student[3];
		stu[0]= new Student (1001, "James");
		stu[1]= new Student (1002, "Tomas");
		stu[2]= new Student (1003, "Edward");
		
		for(Student s : stu) {
			s.showStudentInfo();
		}

	}

}