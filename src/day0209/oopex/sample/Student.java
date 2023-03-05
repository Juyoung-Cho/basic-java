package day0209.oopex.sample;

public class Student {
	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int grade, int money) {
		this.studentName = studentName;
		this.grade = grade;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		System.out.println(studentName + "이 버스에 탑승함.");
		bus.take();
		money -= bus.charge;
	}
	
	public void takeSubway(Subway subway) {
		System.out.println(studentName + "이 지하철에 탑승함.");
		subway.take();
		money -= subway.charge;
	}
	
	public void showInfo() {
		System.out.printf("%s의 남은 돈은 %d원입니다.\n",studentName,money);
	}
	
	
	

}
