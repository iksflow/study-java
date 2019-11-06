package training.stream;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class MapAndReduceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentList = Arrays.asList(
			new Student("ȫ�浿", 10),
			new Student("�ſ��", 20),
			new Student("���̼�", 30)
		);
				
		double avg = studentList.stream()
				.mapToInt(Student :: getScore)
				.average()
				.getAsDouble();
		System.out.println(String.format("��� ����: %s", avg));
	}

}
