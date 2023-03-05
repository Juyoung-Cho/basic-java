package day0228.io.sample;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx1 {
	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("output.txt")){
			
			fos.write(65);
			fos.write('B');
			fos.write('C');
			fos.write('한');
			fos.write('글');
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력 완료");

	}

}
