package day0209.oopex.sample;

public class Subway {
	String lineNumber;
	int count;
	int income;
	int charge;
	
	public Subway(String lineNumber, int charge) {
		this.lineNumber = lineNumber;
		this.charge = charge;
	}
	
	public void take() {
		income += charge;
		count++;
	}
	
	public void showInfo() {
		System.out.printf("%s번 지하철의 승객은 %d명이고 수입은 %d입니다.\n",lineNumber,count,income);
	}

}
