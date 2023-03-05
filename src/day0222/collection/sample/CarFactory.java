package day0222.collection.sample;

import java.util.HashMap;

public class CarFactory {
	//싱글톤 패턴
	private static CarFactory instance = new CarFactory();
	private CarFactory() {}
	public static CarFactory getInstance() {
		if (instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	//name - key : value - Car
	HashMap<String, Car> carMap = new HashMap<>();
	public Car createCar(String name) {
		if(carMap.containsKey(name)) {
			return carMap.get(name);
		}else {
			Car car = new Car(name);
			carMap.put(name, car);
			return car;
		}
		
	}

}
