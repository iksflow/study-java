package training.stream;

import java.util.Arrays;
import java.util.List;

public class StreamPipelinesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Member> list = Arrays.asList(
			new Member("ȫ�浿", Member.MALE, 30),
			new Member("�質��", Member.FEMALE, 20),
			new Member("�ſ��", Member.MALE, 45),
			new Member("�ڼ���", Member.FEMALE, 27)
		);
		
		double ageAvg = list.stream()
				.filter(m -> m.getSex() == Member.MALE)
				.mapToInt(Member :: getAge)
				.average()
				.getAsDouble();
		
		System.out.println(String.format("���� ��� ���� : %6.1f", ageAvg));
		list.stream()
		.map(Member :: getName)
		.forEach(a -> System.out.println(a));
	}

}
