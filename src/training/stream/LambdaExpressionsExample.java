package training.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = Arrays.asList(new Student("ȫ�浿", 90), new Student("�ſ��", 92));
		
		Stream<Student> stream = list.stream();
		
		stream.forEach(student -> {
			String name = student.getName();
			int score = student.getScore();
			System.out.println(String.format("%s : %d", name, score));
		});
	}

}
