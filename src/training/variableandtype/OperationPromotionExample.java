package training.variableandtype;

public class OperationPromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue1 = 10;
		byte byteValue2 = 20;
//		byte byteValue3 = byteValue1 + byteValue2;	 
//		�ڹٿ����� ���������� intŸ���� �⺻���� �ϱ⶧���� 4byte���� ���� Ÿ��(byte, char, short)�� int Ÿ������ ��ȯ�ؼ� �����ϰ�
//		������ ����� intŸ���� �ȴ�. �� �ڵ�� byte�� 4byte int�� ������ �� ���⿡ ������ ������ �߻��Ѵ�.
		byte byteValue3 = (byte)(byteValue1 + byteValue2);
		
		System.out.println(byteValue3);
		
		char charValue1 = 'A';
		char charValue2 = 1;
//		char charValue3 = charValue1 + charValue2;
		char charValue3 = (char)(charValue1 + charValue2);
//		���� byte ������ ���� ������ ������ �߻��Ѵ�.
		
		System.out.println(charValue3);
		
		int intValue1 = 10;
		int intValue2 = intValue1/4;
		System.out.println(intValue2);
		
		int intValue3 = 10;
//		int intValue4 = 10 / 4.0;
//		int �� double�� �����̹Ƿ� double�� Ÿ������ �ڵ���ȯ�Ǿ� �����ϱ⿡ doubleŸ���� ��ȯ�� �ȴ�.
//		10 / 4.0�� ������� �������� double Ÿ�� �̻��� ũ�⸦ �������Ѵ�.
		double doubleValue1 = intValue3 / 4.0;
		System.out.println(doubleValue1);
	}

}
