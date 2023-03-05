package day0228.io.sample;

import java.io.IOException;

public class SystemInTest {
	public static void main(String[] args) {
		System.out.println("알파벳 하나 입력 후 [enter]를 누르세요.");
		
		int i;
		try {
			i = System.in.read();
			System.out.println(i);
			System.out.println((char)i);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
