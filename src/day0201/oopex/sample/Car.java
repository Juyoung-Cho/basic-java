package day0201.oopex.sample;

public class Car {
	int speed;
	String carNumber;
	String model;
	String color;
	
	void drive (int s) {
		speed += s;
	}
	
	void slow (int s) {
		if ((speed - s) >= 0) {
			speed -= s;
		}else {
			speed = 0;
		}
	}
	
	void stop(){
		speed = 0;
	}
	
	String getModel() {
		return model;
	}

}
