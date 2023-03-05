package ncs.test;
//run as -> run configurations - > 2번째칸 ->(x) arguments에 값 입력
//main안에서 args를 사용한다면 실행할 때 값을 넣어줘야 함.
public class ArgsTest {
	public static void main(String[] args) {
		
		for(String s : args) {
			System.out.println(s);
		}

	}

}
