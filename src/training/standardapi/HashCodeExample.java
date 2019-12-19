package training.standardapi;

import java.util.Arrays;
import java.util.Objects;

public class HashCodeExample {

	public static void main(String[] args) {
		// hash, hashCode�� �ؽ��ڵ� ���� 31 ���̳�
		Student s1 = new Student(1, "ȫ�浿");
		Student s2 = new Student(1, "ȫ�浿");
		// Student�� hashCode�� ȣ��
		System.out.println(s1.hashCode());	
		System.out.println(s2.hashCode());
		// Student�� hashCode�� ȣ��
		System.out.println(Objects.hashCode(s1));
		System.out.println(Objects.hashCode(s2));
		// ���ڷ� �ѱ� ��ü�� ������ �ؽ��ڵ带 ����
		System.out.println(Objects.hash(s1));
		System.out.println(Objects.hash(s2));
		// Arrays.hashCode
		Object[] obj1 = new Object[] {s1};
		Object[] obj2 = new Object[] {s2};
		System.out.println(Arrays.hashCode(obj1));
		System.out.println(Arrays.hashCode(obj2));
		Object a = 1;
		Object b = "ȫ�浿";
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

