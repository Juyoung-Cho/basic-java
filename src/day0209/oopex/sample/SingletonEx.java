package day0209.oopex.sample;
//객체를 한개만 만들 클래스
class Singleton{
	int x;
	private static Singleton s = new Singleton();//미리 객체 한 개 생성.
	//private 생성자
	private Singleton() {}
	
	//만들어진 객체의 주소값을 리턴(static이 있어야 다른 클래스가 사용가능)
	public static Singleton getInstance() {
		if(s==null) {
			s= new Singleton();
		}
		return s;
	}
}

public class SingletonEx {
	public static void main(String[] args) {
		// Singleton s = new Singleton(); //외부에서는 객체 생서X
		Singleton s = Singleton.getInstance();//만들어져있는 객체의 주소값을 가져와 저장.
		Singleton s1 = Singleton.getInstance();
		
		System.out.println(s==s1); //객체 하나를 만들었으니, 당연히 동일한 주소값.
		
		s.x =10;
		
		System.out.println(s.x); //10
		System.out.println(s1.x); //10

	}

}
