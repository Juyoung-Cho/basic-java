package day0209.oopex.sample;

public class Bus {
	int busNumber;
	int charge;
	int income;
	int count;
	
	public Bus(int busNumber, int charge) {
		this.busNumber = busNumber;
		this.charge = charge;
	}
	
	public void take() {
		income += charge;
		count++;
	}
	
	public void showInfo() {
		System.out.printf("%d번 버스의 승객은 %d명이고 수입은 %d입니다.\n",busNumber,count,income);
	}

	
	

}
