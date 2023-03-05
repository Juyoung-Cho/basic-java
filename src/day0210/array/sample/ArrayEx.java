package day0210.array.sample;
//이차원 배열 : 1차원 배열을 여러개 가지고 있는 배열
public class ArrayEx {
	public static void main(String[] args) {
		int[][] score = {{100,100,100},{50,50,50},{30,30,30},{40,40,40}};
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0 ; j < score[i].length;j++) {
				System.out.println(score[i][j]);
			}
		}

	}

}
