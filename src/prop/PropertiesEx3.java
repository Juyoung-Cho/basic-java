package prop;

import java.io.*;
import java.util.*;

public class PropertiesEx3 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Properties p = new Properties();
		
		String path = "C:/cho_workspace/JanJava/src/day0224/collection/sample/data.properties";
		
		p.load(new FileInputStream(path));
		
		String name = p.getProperty("name");
		String[] data = p.getProperty("data").split(",");
		
		int sum = 0;
		double avg = 0;
		
		for(int i = 0; i < data.length;i++) {
			int d = Integer.parseInt(data[i]);
			sum += d;
		}
		
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + sum/(double)data.length);
	}

}
