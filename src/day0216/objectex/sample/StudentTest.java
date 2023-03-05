package day0216.objectex.sample;

class Student{
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return id + name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			//현재 객체의 id값과 매개변수로 받아온 객체의 id값이 같으면 true.
			boolean b1 = id == ((Student) obj).id;
			//참조형은 equals()로 비교
			boolean b2 = name.equals(((Student)obj).name);
			return b1&&b2;
		}
		return false; //Student타입이 아닌 경우 비교할 필요 없음.
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student(1001,"JAVA");
		Student s2 = new Student(1002,"GAGA");
		Student s3 = new Student(1001,"JAVA");
		
		//== 변수에 저장된 값(주소)만 비교
		if(s1 == s2) {
			System.out.println("s1과 s2는 같은 학생입니다.");
		}else {
			System.out.println("s1과 s2는 다른 학생입니다.");
		}
		if(s1 == s3) {
			System.out.println("s1과 s3는 같은 학생입니다.");
		}else {
			System.out.println("s1과 s3는 다른 학생입니다.");
		}
		//객체를 비교 시에는 equals()를 이용
		//그러나 Object클래스에서는 주소값 비교 따라서 오버라이딩을 하여 사용해야함.
		if(s1.equals(s3)) {
			System.out.println("s1과 s3는 같은 학생입니다.");
		}else {
			System.out.println("s1과 s3는 다른 학생입니다.");
		}
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode()); //논리적으로 s1과s3는 같아야하므로 hashcode도 오버라이딩

	}

}
