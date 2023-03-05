package day0228.io.sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx3 {
	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("input.txt");) {
			byte[] b = new byte[100];
			int i;
			while((i = fis.read(b)) != -1) {
				for(int k = 0; k < i; k++) {
					System.out.print((char)b[k]);
				}
				System.out.println();
				System.out.println(new String(b));
			}
			System.out.println("last i : "+i);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("end");

	}

}
