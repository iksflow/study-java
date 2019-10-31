package training.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingAndReductionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<StudentNew> totalList = Arrays.asList(
				new StudentNew("ȫ�浿", 10, StudentNew.Sex.MALE, StudentNew.City.Seoul),
				new StudentNew("�����", 6, StudentNew.Sex.FEMALE, StudentNew.City.Pusan),
				new StudentNew("�ſ��", 10, StudentNew.Sex.MALE, StudentNew.City.Pusan),
				new StudentNew("�ڼ���", 6, StudentNew.Sex.FEMALE, StudentNew.City.Seoul)
				);
		Map<StudentNew.Sex, Double> mapBySex = totalList.stream()
				.collect(
						Collectors.groupingBy(StudentNew :: getSex, Collectors.averagingDouble(StudentNew :: getScore))
						);
		
		System.out.println(String.format("���л� ���� ���: %.2f ",mapBySex.get(StudentNew.Sex.MALE)));
		System.out.println(String.format("���л� ���� ���: %.2f ",mapBySex.get(StudentNew.Sex.FEMALE)));
		
		Map<StudentNew.Sex, String> mapByName = totalList.stream()
				.collect(
						Collectors.groupingBy(StudentNew :: getSex, Collectors.mapping(StudentNew :: getName, Collectors.joining(",")))
						);
		
		System.out.println(String.format("���л� ��ü �̸�: %s", mapByName.get(StudentNew.Sex.MALE)));
		System.out.println(String.format("���л� ��ü �̸�: %s", mapByName.get(StudentNew.Sex.FEMALE)));
				
	}

}
