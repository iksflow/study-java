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
				new StudentNew("홍길동", 10, StudentNew.Sex.MALE),
				new StudentNew("김수애", 6, StudentNew.Sex.FEMALE),
				new StudentNew("신용권", 10, StudentNew.Sex.MALE),
				new StudentNew("박수미", 6, StudentNew.Sex.FEMALE)
				);
		
		// 남학생들만 묶어서 List 생성
		List<StudentNew> maleList = totalList.stream()
				.filter(s -> s.getSex() == StudentNew.Sex.MALE)
				.collect(Collectors.toList());
		
		maleList.stream()
		.forEach(s -> System.out.println(s.getName()));
		
		System.out.println();

		// 여학생들만 묶어서 HashSet 생성
		Set<StudentNew> femaleSet = totalList.stream()
				.filter(s -> s.getSex() == StudentNew.Sex.FEMALE)
				.collect(Collectors.toSet());
		
		femaleSet.stream()
		.forEach(s -> System.out.println(s.getName()));
		
		System.out.println();
		
		// 여학생들만 묶어서 HashSet 생성
		Set<StudentNew> femaleHashSet = totalList.stream()
				.filter(s -> s.getSex() == StudentNew.Sex.FEMALE)
				.collect(Collectors.toCollection(HashSet :: new));
		
		femaleHashSet.stream()
		.forEach(s -> System.out.println(s.getName()));
		
	}

}
