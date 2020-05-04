package training.variable;

public class Literal {
	public static void main(String[] args) {
		// ���� ���ͷ� (byte, char, short, int, long)
		int numOfDecimal = 40;	// 10���� ���ͷ��� ���� �ʱ�ȭ
		int numOfOctal = 011;	// 8���� ���ͷ��� ���� �ʱ�ȭ
		int numOfHex = 0xA1;	// 16���� ���ͷ��� ���� �ʱ�ȭ
		
		System.out.println(numOfDecimal);
		System.out.println(numOfOctal);
		System.out.println(numOfHex);
		
		// �Ǽ� ���ͷ� (float, double)
		float numOfFloat = 0.25f;
		float numOfFloatE = 0.2E3f;
		double numOfDouble = 0.25;
		double numOfDoubleE = 0.2E3;
		System.out.println(numOfFloat);
		System.out.println(numOfFloatE);
		System.out.println(numOfDouble);
		System.out.println(numOfDoubleE);
		
		// ���� ���ͷ� (char)
		char character = 'A';
		char charEscape = '\n';
		char charUnicode = '\u0022';
		System.out.println(character);
		System.out.println(charEscape);
		System.out.println(charUnicode);
		
		// ���ڿ� ���ͷ� (String)
		String str = "Hello";
		System.out.println(str);
		
		// �� ���ͷ� (boolean)
		boolean boolTrue = true;
		boolean boolFalse = false;
		System.out.println(boolTrue);
		System.out.println(boolFalse);
	}
}
