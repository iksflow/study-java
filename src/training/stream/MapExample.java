package training.stream;

import java.util.Arrays;
import java.util.List;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentList = Arrays.asList(
			new Student("ȫ�浿", 10),
			new Student("�ſ��", 20),
			new Student("���̼�", 30)
		);
		
		studentList.stream()
		.mapToInt(Student :: getScore)
		.forEach(System.out :: println);
		System.out.println();
		
		studentList.stream()
		.map(student -> student.getName())
		.forEach(System.out :: println);
		
	}

}
