package training.iostream;

import java.time.LocalDate;

public class PrintfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("��ǰ�� ����:%d��\n", 123);
		System.out.printf("��ǰ�� ����:%6d��\n", 123);
		System.out.printf("��ǰ�� ����:%-6d��\n", 123);
		System.out.printf("��ǰ�� ����:%06d��\n", 123);
		
		System.out.printf("�������� %d�� ���� ����:%10.2f\n", 10, Math.PI*10*10);
		System.out.printf("%6d | %-10s | %10s\n", 1, "ȫ�浿", "����");
		
		LocalDate now = LocalDate.now();
		
		System.out.printf("������ %tY�� %tm�� %td�� �Դϴ�\n", now, now, now);
		System.out.printf("������ %1$tY�� %1$tm�� %1$td�� �Դϴ�\n", now);
		
	}

}
