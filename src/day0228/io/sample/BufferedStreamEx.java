package day0228.io.sample;

import java.io.*;

public class BufferedStreamEx {
	public static void main(String[] args) {
		
		long mills = System.currentTimeMillis();
		
		try(FileInputStream fis = new FileInputStream("a.zip");
			BufferedInputStream bis = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream("copy,zip");
			BufferedOutputStream bos = new BufferedOutputStream(fos)){
			
			int i;
			while((i = bis.read()) != -1) {
				bos.write(i);
			}
			mills = System.currentTimeMillis()-mills;
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException ie) {
			ie.printStackTrace();
		}
		System.out.println("복사 시간 : "+mills+"ms");
	}

}
