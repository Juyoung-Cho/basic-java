package day0216.stringex.sample;

public class StringTest2 {
	public static void main(String[] args) {
		String filename = "hello.java";
		int index = filename.indexOf(".");//int index = 5
		String name = filename.substring(0, index);//0부터 index(5)앞까지 반환
		String ext = filename.substring(index+1); //6번 부터 끝까지.
		
		System.out.println(filename+"의 파일명은 "+name+"이고 확장자는"+ext+"입니다.");
		
		String abc = "abc";
		System.out.println(abc.indexOf("z")); //z는 없으니까 -1반환
		

	}

}
