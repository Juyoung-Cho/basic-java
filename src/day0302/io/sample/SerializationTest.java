package day0302.io.sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
	private static final long serialVersionUID = 1L;
	String name;
	transient String job; //직렬화 대상에서 제외
	
	public Person() {}

	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job + "]";
	}
	
	
	
}


public class SerializationTest {
	public static void main(String[] args) {
		Person p1 = new Person("kk","teacher");
		Person p2 = new Person("JJ","actor");
		
		try(FileOutputStream fos = new FileOutputStream("serial.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(p1); //직렬화
			oos.writeObject(p2); //메서드는 보내지 않음.
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(FileInputStream fis = new FileInputStream("serial.out");
			ObjectInputStream ois = new ObjectInputStream(fis)){
			Person nwp1;
			try {
				nwp1 = (Person)ois.readObject(); //역직렬화
				System.out.println(nwp1);
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}
			Person nwp2;
			try {
				nwp2 = (Person)ois.readObject();
				System.out.println(nwp2);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
