package training.stream;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("홍길동", "신용권", "감자바", "신용권", "신민철");
		
		// 중복 제거
		names.stream()
		.distinct()
		.forEach(name -> System.out.println(name));
		System.out.println();
		
		// 신으로 시작하는 이름만 출력
		names.stream()
		.filter(name -> name.startsWith("신"))
		.forEach(name -> System.out.println(name));
		System.out.println();
		
		// 중복 제거 후 필터링
		names.stream()
		.distinct()
		.filter(name -> name.startsWith("신"))
		.forEach(name -> System.out.println(name));
		
		
	}

}
