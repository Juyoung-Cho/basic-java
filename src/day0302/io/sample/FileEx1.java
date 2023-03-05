package day0302.io.sample;

import java.io.File;
import java.io.IOException;

public class FileEx1 {
	public static void main(String[] args) throws IOException {
		String filePath = "c:\\";
		File f1 = new File(filePath); //File객체 생성시 경로 지정
		
		String[] list = f1.list(); //하위 디렉토리 이름과 파일명
		
		for(String name : list) {
			File f2 = new File(filePath,name);
			if(f2.isDirectory()) {
				System.out.printf("%s : 디렉토리 \n", name);
			}else {
				System.out.printf("%s : 파일 (%,dbyte) \n",name,f2.length());
			}
		}
		
		File f3 = new File("d:\\test.txt");
		System.out.println(f3.createNewFile());
		
		System.out.println(f3.getPath());
		System.out.println(f3.getAbsolutePath());
		System.out.println(f3.getCanonicalPath());
		
		System.out.println(f3.getName());
		System.out.println(f3.getParent());
		
		// System.out.println(f3.delete());
		
		File f4 = new File("d:\\test.txt");
		File f5 = new File("d:\\test.txt1");
		
		System.out.println(f4.renameTo(f5));
		

	}

}
