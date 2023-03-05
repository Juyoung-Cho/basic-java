package day0228.io.sample;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx2 {
	public static void main(String[] args) {
		String str = "ABCDEFG";
		try(FileOutputStream fos = new FileOutputStream("output2.txt",true)){
			
			fos.write(str.getBytes());
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력완료");

	}

}
