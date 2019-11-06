package training.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Int 요소일 때
		IntStream intStream = Arrays.stream(new int[] {5, 3, 2, 1, 4});
		intStream
		.sorted()
		.forEach(System.out :: println);
		System.out.println();
		// 객체요소일 떄
		List<Student> studentList = Arrays.asList(
			new Student("홍길동", 50),
			new Student("신용권", 20),
			new Student("유미선", 30),
			new Student("김장철", 70)
		);

		// 점수 낮은순
		studentList.stream()
		.sorted()
		.forEach(student -> System.out.println(student.getName()));
		System.out.println();
		
		// 점수 높은순
		studentList.stream()
		.sorted((a,b) -> b.compareTo(a))
		.forEach(student -> System.out.println(student.getName()));
		System.out.println();

		// 점수 높은순
		studentList.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(student -> System.out.println(student.getName()));
		System.out.println();
		
		// 이름 순
		studentList.stream()
		.sorted((a,b) -> {
			return a.getName().compareTo(b.getName());
		})
		.forEach(student -> System.out.println(student.getName()));
		System.out.println();		
	}

}
