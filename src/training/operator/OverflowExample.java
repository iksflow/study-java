package training.operator;

public class OverflowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		System.out.println(z);	// int�� ��������� �ʰ��� ���� ���� �����Ⱚ�� �����Եȴ�.
		
		long a = 1000000;
		long b = 1000000;
		long c = a * b;
		System.out.println(c);	// long Ÿ�Կ��� ������ �����ϹǷ� �������� ���� ��µǰ� �ȴ�.
	}

}
