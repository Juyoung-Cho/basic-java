package day0227.lambda.sample;

public class StringConcatTest {
	public static void main(String[] args) {
		StringConcat sc = (s1, s2)->System.out.println(s1+","+s2);
		sc.makeString("java", "kim");

	}

}
