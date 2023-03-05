package day0228.io.sample;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx1 {
	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("writer.txt")){
			fw.write(65);
			fw.write("안녕하세요\n");
			fw.write(new char[] {'A','B','C'});
			fw.write("65");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
