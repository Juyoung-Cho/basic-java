package day0131.switchcase.sample;

public class SwitchEx1 {
	public static void main(String[] args) {
		
		int rank = 2;
		String medalColor;
		//rank가 int타입이라, case뒤 조건에도 int타입 작성
		switch (rank) {
			case 1 : medalColor = "Gold";
					 break;
			case 2 : medalColor = "Silver";
					 break;
			case 3 : medalColor = "Bronze";
				  	 break;
			default : medalColor = "메달이 없다.";
		}
		
		System.out.println(medalColor + "메달!!!");

	}

}
