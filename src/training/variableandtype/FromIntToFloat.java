package training.variableandtype;

public class FromIntToFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 123456780;
		int num2 = 123456780;
		
//		float num3 = num2;	// num3 != num2 �� �Ǿ������.
		double num3 = num2;	// ���е� �ս��� ���ϱ� ���ؼ� int�� �����ϰ� ���� �� �ִ� double������ �޾ƾ��Ѵ�.
		
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result);
		
	}
}
