package training.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<StudentNew> totalList = Arrays.asList(
				new StudentNew("ȫ�浿", 10, StudentNew.Sex.MALE, StudentNew.City.Seoul),
				new StudentNew("�����", 6, StudentNew.Sex.FEMALE, StudentNew.City.Pusan),
				new StudentNew("�ſ��", 10, StudentNew.Sex.MALE, StudentNew.City.Pusan),
				new StudentNew("�ڼ���", 6, StudentNew.Sex.FEMALE, StudentNew.City.Seoul)
				);
		
		Map<StudentNew.Sex, List<StudentNew>> mapBySex = totalList.stream()
				.collect(Collectors.groupingBy(StudentNew :: getSex));
		
		System.out.println("[���л�] ");
		mapBySex.get(StudentNew.Sex.MALE).stream()
		.forEach(s -> System.out.println(s.getName()));
		
		System.out.println("[���л�] ");
		mapBySex.get(StudentNew.Sex.FEMALE).stream()
		.forEach(s -> System.out.println(s.getName()));
		
		System.out.println();
		
//		Map<StudentNew.City, List<StudentNew>> mapByCity = totalList.stream()
//				.collect(Collectors.groupingBy(StudentNew :: getCity));
//		
//		System.out.println("\n[����]");
//		mapByCity.get(StudentNew.City.Seoul).stream().forEach(s -> System.out.println(s.getName() + " "));
//		
//		System.out.println("\n[�λ�]");
//		mapByCity.get(StudentNew.City.Pusan).stream().forEach(s -> System.out.println(s.getName() + " "));
		Map<StudentNew.City, List<String>> mapByCity = totalList.stream()
				.collect(
						Collectors.groupingBy(
								StudentNew :: getCity, Collectors.mapping(
										StudentNew :: getName, Collectors.toList()
										)
								)
						);
		System.out.println("[����]");
		mapByCity.get(StudentNew.City.Seoul).stream().forEach(s -> System.out.println(s));
		System.out.println("[�λ�]");
		mapByCity.get(StudentNew.City.Pusan).stream().forEach(s -> System.out.println(s));
				
	}

}
