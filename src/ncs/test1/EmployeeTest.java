package ncs.test1;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setNo("A1892");
		e1.setName("이미주");
		e1.setDept("AI개발부");
		e1.setJob("사원");
		e1.setSal(3500);
		
		Employee e2 = new Employee("B1010","Lee","Web","부장",7000);
		Employee e3 = new Employee("C1010","Park","Web","전무",9000);
		
		Employee[] employees = {e1,e2,e3};
		EmployeeTest et = new EmployeeTest();
		et.search(employees);
		
	}
	public void search(Employee[] emps) {
		Scanner s = new Scanner(System.in);
		boolean run = true; //true : 반복진행, false : 중지
		
		while(run) {
		System.out.println("사원번호를 입력하세요");
		System.out.println("exit입력시 종료됩니다.");
		System.out.print("사원번호 : ");
		
		String input = s.next();
		int x = 0; //0 : 사원없음. 0 아니면 : 사원 있음.
		for(Employee e : emps) {
			if(input.equals(e.getNo())){
				System.out.println(e.getNo()+" : "+e.getDept()+" : "+ e.getName()+" : "+ e.getJob());
				x++;
			}
		}//for
		
		if(x==0) {
			if(input.equals("exit")) {
				System.out.println("종료됩니다.");
				run = false;
			}else {
				System.out.println("해당 사원은 없습니다.");
			}
			
		}
		}//while
	}//search

}
