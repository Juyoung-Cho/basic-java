package day0227.lambda.sample;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferencesExample {
	public static void main(String[] args) {
		Function<String, Member> function1 = Member :: new;
		Member member1 = function1.apply("angel"); //매개변수가 하나짜리인 생성자가 호출
		
		BiFunction<String, String, Member> function2 = Member :: new;
		Member member2 = function2.apply("신천사", "angel"); //매개변수가 두개짜리인 생성자가 호출
	}
}
