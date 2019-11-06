package training.stream;

import java.util.Arrays;
import java.util.List;

public class MaleStudentParallelExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<StudentNew> totalList = Arrays.asList(
				new StudentNew("ȫ�浿", 10, StudentNew.Sex.MALE, StudentNew.City.Seoul),
				new StudentNew("�����", 6, StudentNew.Sex.FEMALE, StudentNew.City.Pusan),
				new StudentNew("�ſ��", 10, StudentNew.Sex.MALE, StudentNew.City.Pusan),
				new StudentNew("�ڼ���", 6, StudentNew.Sex.FEMALE, StudentNew.City.Seoul)
				);
		
		MaleStudent maleStudent = totalList.parallelStream()
				.filter(s -> s.getSex() == StudentNew.Sex.MALE)
				.collect(MaleStudent :: new, MaleStudent :: accumulate, MaleStudent :: combine);
		
		maleStudent.getList().stream()
		.forEach(s -> System.out.println(s.getName()));		
	}

}
