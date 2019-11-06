package training.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class MaleStudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<StudentNew> totalList = Arrays.asList(
				new StudentNew("ȫ�浿", 10, StudentNew.Sex.MALE),
				new StudentNew("�����", 6, StudentNew.Sex.FEMALE),
				new StudentNew("�ſ��", 10, StudentNew.Sex.MALE),
				new StudentNew("�ڼ���", 6, StudentNew.Sex.FEMALE)
				);
		Supplier<MaleStudent> supplier = MaleStudent :: new;
		BiConsumer<MaleStudent, StudentNew> accumulator = (ms, s) -> ms.accumulate(s);
		BiConsumer<MaleStudent, MaleStudent> combiner = (ms1, ms2) -> ms1.combine(ms2);
		
		
		MaleStudent maleStudent = totalList.stream()
				.filter(s -> s.getSex()==StudentNew.Sex.MALE)
				.collect(supplier, accumulator, combiner);
		
		maleStudent.getList().stream()
		.forEach(s -> System.out.println(s.getName()));
	}

}
