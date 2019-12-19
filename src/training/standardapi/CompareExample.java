package training.standardapi;

import java.util.Objects;

public class CompareExample {

	public static void main(String[] args) {
		Student s1 = new Student(1);
		Student s2 = new Student(1);
		Student s3 = new Student(2);
		StudentComparator comparator = new StudentComparator(); 
		
		int result = Objects.compare(s1, s2, comparator);
		System.out.println(result);
		result = Objects.compare(s1, s3, comparator);
		System.out.println(result);
	}

}
