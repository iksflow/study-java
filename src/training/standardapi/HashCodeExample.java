package training.standardapi;

import java.util.Arrays;
import java.util.Objects;

public class HashCodeExample {

	public static void main(String[] args) {
		// hash, hashCode의 해쉬코드 값이 31 차이남
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");
		// Student의 hashCode를 호출
		System.out.println(s1.hashCode());	
		System.out.println(s2.hashCode());
		// Student의 hashCode를 호출
		System.out.println(Objects.hashCode(s1));
		System.out.println(Objects.hashCode(s2));
		// 인자로 넘긴 객체를 가지고 해쉬코드를 만듬
		System.out.println(Objects.hash(s1));
		System.out.println(Objects.hash(s2));
		// Arrays.hashCode
		Object[] obj1 = new Object[] {s1};
		Object[] obj2 = new Object[] {s2};
		System.out.println(Arrays.hashCode(obj1));
		System.out.println(Arrays.hashCode(obj2));
		Object a = 1;
		Object b = "홍길동";
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
	}
	

	static class Student {
		int sno;
		String name;
		Student(int sno, String name) {
			this.sno = sno;
			this.name = name;
		}
		
		public int hashCode() {
			return Objects.hash(sno, name);
		}
	}
}

