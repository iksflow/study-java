package training.variableandtype;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);	// �����ڵ尪�� �ش��ϴ� ���ڰ� ��µ�.
		
//		long longValue = 500;
		long longValue = Long.MAX_VALUE;
		intValue = (int) longValue;
		System.out.println(intValue);	// 500�� int���� ��밡���� �����̱⶧���� ������ȯ�� ����. 
		// ������ MAX_VALUE�� ��´ٸ� ������ ���ع��� �̻��Ѱ��̳����Եȴ� 
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);	// �Ҽ��� �κ��� ������ �����θ� ����Ѵ�.
	}

}
