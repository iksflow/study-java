package training.stream;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("ȫ�浿", "�ſ��", "���ڹ�", "�ſ��", "�Ź�ö");
		
		// �ߺ� ����
		names.stream()
		.distinct()
		.forEach(name -> System.out.println(name));
		System.out.println();
		
		// ������ �����ϴ� �̸��� ���
		names.stream()
		.filter(name -> name.startsWith("��"))
		.forEach(name -> System.out.println(name));
		System.out.println();
		
		// �ߺ� ���� �� ���͸�
		names.stream()
		.distinct()
		.filter(name -> name.startsWith("��"))
		.forEach(name -> System.out.println(name));
		
		
	}

}
