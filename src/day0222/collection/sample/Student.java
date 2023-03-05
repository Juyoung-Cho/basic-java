package day0222.collection.sample;

import java.util.Objects;

public class Student {
	
	String id;
	String name;
	
	public Student(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Integer.parseInt(id);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student st = (Student) obj;
			if(this.id == st.id) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return id + ":" + name ;
	}
	
	

}
