package day0219.object.sample;
//Class.forName으로 객체 생성
//무슨 타입의 객체를 생성할지 실행 중에 결정되는 경우 사용
public class NewInstanceEx {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		String className = "java.lang.String";
		
		Class c = Class.forName(className);
		String s = (String)c.newInstance();
		
		System.out.println("s : "+s);
	}

}
