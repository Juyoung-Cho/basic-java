package day0131.switchcase.sample;

//여러 케이스가 같은 수행문을 가지고 있다면, case 동시 사용 가능.
public class SwitchEx2 {
	public static void main(String[] args) {
		
		int month = 10;
		String day;
		
		switch(month) {
			case 1 : case 3 : case 5 : case 7 : case 8 :
			case 10 : case 12 : day ="31"; break;
			case 4 : case 6 : case 9 : case 11 : day = "30"; break;
			case 2 : day = "28"; break;
			default : day = "해당 달이 존재 하지 않는다.";
		}
		
		if(month >= 1 && month <= 12) {
			System.out.printf("%d월은 %s일까지입니다.",month,day);
		}else {
			System.out.println(day);
		}
	}

}
