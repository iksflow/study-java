package training.ch8_class;

public class CalculatorExample {

	public static void main(String[] args) {
//		��ü ���� �� �����ص� ������ ������� �ʴ� ����̰�, eclipse������ �̷��Ծ��Ÿ� static Ű���带 ����� ���޼����� �����ش�.
//		Calculator cal = new Calculator();
//		double result1 = 10 * 10 * cal.pi;
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}

}
