package day0224.collection.sample;

import java.util.*;

public class PropertiesEx2 {
	public static void main(String[] args) {
		Properties prop = new Properties();
		
		prop.put("timeout", "30");
		prop.setProperty("size", "10");
		prop.setProperty("ip", "192.168.0.6");
		
		//Iterator의 구버전
		Enumeration names = prop.propertyNames();
		
		while(names.hasMoreElements()) {
			String name = (String)names.nextElement();
			System.out.println(name+" = "+prop.getProperty(name));
		}
		
		prop.setProperty("size", "20");
		System.out.println("size = "+prop.getProperty("size")); //기존에 있던 size가 바뀜.
		
		System.out.println();
		prop.list(System.out);
		
		
		
		
		
		
		
	}

}
