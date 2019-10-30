package training.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<StudentNew> totalList = Arrays.asList(
				new StudentNew("ȫ�浿", 10, StudentNew.Sex.MALE),
				new StudentNew("�����", 6, StudentNew.Sex.FEMALE),
				new StudentNew("�ſ��", 10, StudentNew.Sex.MALE),
				new StudentNew("�ڼ���", 6, StudentNew.Sex.FEMALE)
				);
		
		// ���л��鸸 ��� List ����
		List<StudentNew> maleList = totalList.stream()
				.filter(s -> s.getSex() == StudentNew.Sex.MALE)
				.collect(Collectors.toList());
		
		maleList.stream()
		.forEach(s -> System.out.println(s.getName()));
		
		System.out.println();

		// ���л��鸸 ��� HashSet ����
		Set<StudentNew> femaleSet = totalList.stream()
				.filter(s -> s.getSex() == StudentNew.Sex.FEMALE)
				.collect(Collectors.toSet());
		
		femaleSet.stream()
		.forEach(s -> System.out.println(s.getName()));
		
		System.out.println();
		
		// ���л��鸸 ��� HashSet ����
		Set<StudentNew> femaleHashSet = totalList.stream()
				.filter(s -> s.getSex() == StudentNew.Sex.FEMALE)
				.collect(Collectors.toCollection(HashSet :: new));
		
		femaleHashSet.stream()
		.forEach(s -> System.out.println(s.getName()));
		
	}

}
