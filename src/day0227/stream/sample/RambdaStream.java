package day0227.stream.sample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RambdaStream {
//Stream : 다양한 데이터 소스를 표준화된 방법으로 다루기 위한 것.
//데이터를 읽어옴
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(20, 17, 30, 2, 9, 23);
		Comparator<Integer> comp1 = (s1, s2) -> s1 - s2;
		// min/max
		System.out.println("max: "+list.stream().min(comp1).get());
		System.out.println("min "+list.stream().max(Integer::compareTo).get());
		//average
		Double result = list.stream().collect(Collectors.averagingInt(v -> v*2));
		System.out.println("Average: "+result);
		//sort
		System.out.println("sorted:");
		list.stream().sorted()
		        .forEach(System.out::println);

		System.out.println("reversed:");
		list.stream().sorted(Comparator.reverseOrder())
		        .forEach(System.out::println);
		
		System.out.println("limit:");
		Stream<Integer> stream1 = list.stream();//list로 부터 스트림 생성
		Stream<Integer> stream2 = stream1.limit(5);
		stream2.forEach(System.out::println);
		
		Stream<Double> randoms = Stream.generate(Math::random).limit(5);
		randoms.forEach(System.out::println);
		System.out.println("skip:");
		//스트림은 일회용이기 때문에 다시 연결해야 함
		Stream<Integer> stream3 = list.stream();
		Stream<Integer> stream4 = stream3.skip(3);
		stream4.forEach(System.out::println);
		
		
	}

}
