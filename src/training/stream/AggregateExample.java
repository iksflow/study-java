package training.stream;

import java.util.Arrays;

public class AggregateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = {1, 2, 3, 4, 5};
		long count = Arrays.stream(intArr)
				.filter(n -> n % 2 == 0)
				.count();
		System.out.println("2�� ��� ����: " + count);
		
		long sum = Arrays.stream(intArr)
				.filter(n -> n % 2 == 0)
				.sum();
		System.out.println("2�� ��� ��: " + sum);
		
		double avg = Arrays.stream(intArr)
				.filter(n -> n % 2 == 0)
				.average()
				.getAsDouble();
		
		System.out.println("2�� ��� ���: " + avg);
		
		int max = Arrays.stream(intArr)
				.filter(n -> n % 2 == 0)
				.max()
				.getAsInt();
		
		System.out.println("2�� ��� �ִ밪: " + max);
		
		int min = Arrays.stream(intArr)
				.filter(n -> n % 2 == 0)
				.min()
				.getAsInt();
		
		System.out.println("2�� ��� �ּҰ�: " + min);
		
		int first = Arrays.stream(intArr)
				.filter(n -> n % 3 == 0)
				.findFirst()
				.getAsInt();
		
		System.out.println("ù��° 3�� ��� ���: " + first);
	}

}
