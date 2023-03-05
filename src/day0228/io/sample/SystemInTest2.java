package day0228.io.sample;

import java.io.IOException;

public class SystemInTest2 {
	public static void main(String[] args) {
		System.out.println("알파벳 n개 입력 후 [enter]를 누르세요.");
		
		int i;
		try {
		while((i = System.in.read()) != '\n') {
			System.out.println((char)i);
		}
		}catch(IOException e){
			e.printStackTrace();
		}

	}

}
