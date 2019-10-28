package training.stream;

import java.util.Arrays;

public class LoopingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = { 1, 2, 3, 4, 5 };
		
		System.out.println("[peek()�� �������� ȣ���� ���]");
		Arrays.stream(intArr)
		.filter(a -> a%2 == 0)
		.peek(n -> System.out.println(n));	// ����ó�� �޼ҵ尡 ���⶧���� ������� �ʴ´�.
		
		System.out.println("����ó�� �޼ҵ带 �������� ȣ���� ���");
		int total = Arrays.stream(intArr)
		.filter(a -> a%2 == 0) 
		.peek(n -> System.out.println(n))
		.sum();
		
		System.out.println("����" + total);
		
		System.out.println("[forEach()�� �������� ȣ���� ���]");
		Arrays.stream(intArr)
		.filter(a -> a%2 == 0)
		.forEach(n -> System.out.println(n));
		
	}

}
