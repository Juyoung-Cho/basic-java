package day0201.oopex.sample;

public class CarTest {
	public static void main(String[] args) {
		
		Car c = new Car();
		
		c.model = "Casper";
		c.color = "red";
		c.carNumber = "123자1234";
		for(int i = 0 ; i <= 10 ; i++) {
			c.drive(10);
		}
		c.stop();
		c.drive(10);
		c.drive(10);
		c.slow(5);
		System.out.println("현재 속도 : " + c.speed);
		

	}

}
