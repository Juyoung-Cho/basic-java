package day0205.oopex.var;

public class Car {
	int speed;
	String carNumber;
	String model;
	String color;
	
	Car(){} //기본 생성자
	Car(String c, String m){
		/*color = c;
		model = m;*/
		this(null, c, m); //같은 클래스에 있는 생성자(String,String,String)호출
	}
	//매개변수도 어떤 값을 받아오는지 알 수 있도록 이름을 설정
	//지역변수와 인스턴스변수가 이름이 같으면 지역변수가 우선권을 갖음. 
	//지역변수와 인스턴스변수를 구별하기 위해 인스턴스변수 앞에 this.를 붙여줌.
	//this참조변수 = 지금 생성한 객체의 주소값 저장
	Car(String carNumber, String color, String model){
		this.carNumber = carNumber;
		this.color = color;
		this.model = model;
	}
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
