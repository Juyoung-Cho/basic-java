package ncs.test2;

public class Sales extends Employee implements Bonus {
	
	

	public Sales() {
		super();
	}

	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	@Override
	public void incentive(int pay) {
		salary +=(int) (pay*1.2);
	}

	@Override
	public double tax() {
		return getSalary()*0.13;
	}

	@Override
	public String toString() {
		return getName() + "\t" + getDepartment() + "\t\t" + getSalary();
	}
	

}
