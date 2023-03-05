package day0213.poly.sample;
//형변환 가능여부 판별
//if (변수 instanceof 변활할 타입{
//	true : 변환 가능
//	}else{//변환 불가능} //else는 굳이 쓸 필요 없음
public class CastingTest2 {
	public static void main(String[] args) {
		
		Car car = new Car();
		Car f = new FireEngine();
		
		if(f instanceof FireEngine) {
			FireEngine fe = (FireEngine)f;
			fe.water();
		}
		
		
		if(car instanceof FireEngine) {
			FireEngine fe = (FireEngine)car;
		}else {
			System.out.println("변환 불가");
		}
		// FireEngine fe = (FireEngine)car; //다형성 노노노 실제 객체는 car
		
		// fe.water(); 

	}

}
