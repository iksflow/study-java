package training.operator;

public class SignOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1= " + result1);	// +��ȣ�����ڴ� ���� ��ȣ�� �����ϱ⿡ -100
		System.out.println("result2= " + result2);	// -��ȣ�����ڴ� ���� ��ȣ�� �����ϱ⿡  100
		
		short s = 100;
//		short result3 = -s;	// ��ȣ�������� �������� intŸ������ ��ȯ�ϹǷ� shortŸ�� ������ ������ �� ��� �����Ͽ����� ����.
		int result3 = -s;
		System.out.println("result3 = " + result3);
	}

}
