package ncs.test2;

public class Company {
	public static void main(String[] args) {
		System.out.println("name\tdepartment\tsalary");
		System.out.println("------------------------------------");
		Employee[] employees = new Employee[2];
		employees[0] = new Secretary("Hilery",1,"secretary",800);
		employees[1] = new Sales("Clinten",2,"sales",1200);
		
		for(Employee emp : employees) {
			System.out.println(emp);
		}
		
		System.out.println();
		System.out.println("인센티브 100지급");
		
		System.out.println("name\tdepartment\tsalary\ttax");
		System.out.println("------------------------------------");
		
		for(Employee emp : employees) {
			if(emp instanceof Secretary) {
				Secretary s = (Secretary)emp;
				s.incentive(100);
			}
			if(emp instanceof Sales) {
				Sales s = (Sales)emp;
				s.incentive(100);
			}
		}
		for(Employee e : employees) {
			System.out.println(e+"\t"+e.tax());
		}
		
		

	}

}
