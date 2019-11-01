package training.stream;

import java.util.Arrays;
import java.util.List;

public class MaleStudentParallelExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<StudentNew> totalList = Arrays.asList(
				new StudentNew("홍길동", 10, StudentNew.Sex.MALE, StudentNew.City.Seoul),
				new StudentNew("김수애", 6, StudentNew.Sex.FEMALE, StudentNew.City.Pusan),
				new StudentNew("신용권", 10, StudentNew.Sex.MALE, StudentNew.City.Pusan),
				new StudentNew("박수미", 6, StudentNew.Sex.FEMALE, StudentNew.City.Seoul)
				);
		
		MaleStudent maleStudent = totalList.parallelStream()
				.filter(s -> s.getSex() == StudentNew.Sex.MALE)
				.collect(MaleStudent :: new, MaleStudent :: accumulate, MaleStudent :: combine);
		
		maleStudent.getList().stream()
		.forEach(s -> System.out.println(s.getName()));		
	}

}
