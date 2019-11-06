package training.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Int ����� ��
		IntStream intStream = Arrays.stream(new int[] {5, 3, 2, 1, 4});
		intStream
		.sorted()
		.forEach(System.out :: println);
		System.out.println();
		// ��ü����� ��
		List<Student> studentList = Arrays.asList(
			new Student("ȫ�浿", 50),
			new Student("�ſ��", 20),
			new Student("���̼�", 30),
			new Student("����ö", 70)
		);

		// ���� ������
		studentList.stream()
		.sorted()
		.forEach(student -> System.out.println(student.getName()));
		System.out.println();
		
		// ���� ������
		studentList.stream()
		.sorted((a,b) -> b.compareTo(a))
		.forEach(student -> System.out.println(student.getName()));
		System.out.println();

		// ���� ������
		studentList.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(student -> System.out.println(student.getName()));
		System.out.println();
		
		// �̸� ��
		studentList.stream()
		.sorted((a,b) -> {
			return a.getName().compareTo(b.getName());
		})
		.forEach(student -> System.out.println(student.getName()));
		System.out.println();		
	}

}
