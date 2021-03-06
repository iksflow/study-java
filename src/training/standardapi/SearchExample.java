package training.standardapi;

import java.util.Arrays;

public class SearchExample {

	public static void main(String[] args) {
		// �⺻ Ÿ�԰� �˻�
		int[] scores = { 99, 97, 98 };
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("ã�� �ε���: " + index);
		
		// ���ڿ� �˻�
		String[] names = { "ȫ�浿", "�ڵ���", "��μ�" };
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "ȫ�浿");
		System.out.println("ã�� �ε���: " + index);
		
		// ��ü �˻�
		Member3 m1 = new Member3("ȫ�浿");
		Member3 m2 = new Member3("�ڵ���");
		Member3 m3 = new Member3("��μ�");
		Member3[] members = { m1, m2, m3 };
		Arrays.sort(members);
		index = Arrays.binarySearch(members, m1);
		System.out.println("ã�� �ε���: " + index);
	}

}
