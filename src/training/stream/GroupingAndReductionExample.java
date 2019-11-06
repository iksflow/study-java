package training.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingAndReductionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<StudentNew> totalList = Arrays.asList(
				new StudentNew("홍길동", 10, StudentNew.Sex.MALE, StudentNew.City.Seoul),
				new StudentNew("김수애", 6, StudentNew.Sex.FEMALE, StudentNew.City.Pusan),
				new StudentNew("신용권", 10, StudentNew.Sex.MALE, StudentNew.City.Pusan),
				new StudentNew("박수미", 6, StudentNew.Sex.FEMALE, StudentNew.City.Seoul)
				);
		Map<StudentNew.Sex, Double> mapBySex = totalList.stream()
				.collect(
						Collectors.groupingBy(StudentNew :: getSex, Collectors.averagingDouble(StudentNew :: getScore))
						);
		
		System.out.println(String.format("남학생 점수 평균: %.2f ",mapBySex.get(StudentNew.Sex.MALE)));
		System.out.println(String.format("여학생 점수 평균: %.2f ",mapBySex.get(StudentNew.Sex.FEMALE)));
		
		Map<StudentNew.Sex, String> mapByName = totalList.stream()
				.collect(
						Collectors.groupingBy(StudentNew :: getSex, Collectors.mapping(StudentNew :: getName, Collectors.joining(",")))
						);
		
		System.out.println(String.format("남학생 전체 이름: %s", mapByName.get(StudentNew.Sex.MALE)));
		System.out.println(String.format("여학생 전체 이름: %s", mapByName.get(StudentNew.Sex.FEMALE)));
				
	}

}
