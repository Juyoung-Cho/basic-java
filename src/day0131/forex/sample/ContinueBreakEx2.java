package day0131.forex.sample;

public class ContinueBreakEx2 {

	public static void main(String[] args) {
		
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0; j < 3 ; j++) {
				if(j == 1) {
					break;
				}
				System.out.println(i+ " "+ j);
			}
			System.out.println("===========");
		}//for 종료 

	}

}
