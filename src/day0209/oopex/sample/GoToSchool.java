package day0209.oopex.sample;

public class GoToSchool {
	public static void main(String[] args) {
		Subway subway2 = new Subway("2",1250);
		Bus bus100 = new Bus(100,1000);
		Bus bus200 = new Bus(200,1000);
		Student student1 = new Student ("Jerry",1,10000);
		Student student2 = new Student ("Tom",2,15000);
		student1.takeSubway(subway2);
		student1.takeBus(bus100);
		student2.takeBus(bus200);
		student1.showInfo();
		student2.showInfo();
		
		subway2.showInfo();
		bus100.showInfo();
		bus200.showInfo();
		

	}

}
