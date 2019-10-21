package training.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorVsStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("홍길동", "신용권", "감자바");
		
		// Iterator 사용
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			String value = iterator.next();
			System.out.println(value);
		}
		System.out.println( );
		// Stream 사용
		Stream<String> stream = list.stream();
		stream.forEach(value -> System.out.println(value));
	}

}
