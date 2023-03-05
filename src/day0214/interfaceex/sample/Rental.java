package day0214.interfaceex.sample;

interface Computer{
	int getRentalPrice(int day);
}

class NoteBook implements Computer{

	@Override
	public int getRentalPrice(int day) {
		int cost = 500;
		day -= 2;
		if(day > 0) {
			cost += (day * 200);
		}
		return cost;
	}
}

class DeskTop implements Computer{

	@Override
	public int getRentalPrice(int day) {
		int cost = 1000;
		day -= 3;
		if(day > 0) {
			cost += (day *300);
		}
		return cost;
	}
	
}

public class Rental {
	public static void main(String[] args) {
		Rental sol = new Rental();//calcPrice 메서드 사용하기 위해 객체 생성
		String [] types = {"desktop", "notebook", "notebook"};
		int day = 4;
		int ret = sol.calcPrice(types, day);
		
		//실행 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("전체 대여료는 "+ret+"원입니다.");

	}
	
	public int calcPrice(String[] types, int day) {
		Computer[] coms = new Computer[50]; 
		int length = types.length;
		for(int i = 0; i <length; ++i) {
			if(types[i].equals("desktop")) {
				coms[i]=new DeskTop();
			}else if(types[i].equals("notebook")) {
				coms[i]=new NoteBook();
			}
		}
	int totalPrice = 0;
	for (int i = 0; i < length; ++i) {
		totalPrice += coms[i].getRentalPrice(day);
		}
	return totalPrice;
	}

}
