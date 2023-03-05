package ncs.test;

public class CustomerMain {
	public static void main(String[] args) {
		Customer c = new Customer();
		Noodle nd = new Noodle();
		Rice rc = new Rice();
		c.order(nd);
		c.order(rc);
		
		System.out.println("현재 남은 돈 : "+c.money);
		System.out.println("포인트 : "+c.point);

	}

}
