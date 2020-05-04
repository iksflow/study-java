package training.variable;

public class Literal {
	public static void main(String[] args) {
		// 정수 리터럴 (byte, char, short, int, long)
		int numOfDecimal = 40;	// 10진수 리터럴에 의한 초기화
		int numOfOctal = 011;	// 8진수 리터럴에 의한 초기화
		int numOfHex = 0xA1;	// 16진수 리터럴에 의한 초기화
		
		System.out.println(numOfDecimal);
		System.out.println(numOfOctal);
		System.out.println(numOfHex);
		
		// 실수 리터럴 (float, double)
		float numOfFloat = 0.25f;
		float numOfFloatE = 0.2E3f;
		double numOfDouble = 0.25;
		double numOfDoubleE = 0.2E3;
		System.out.println(numOfFloat);
		System.out.println(numOfFloatE);
		System.out.println(numOfDouble);
		System.out.println(numOfDoubleE);
		
		// 문자 리터럴 (char)
		char character = 'A';
		char charEscape = '\n';
		char charUnicode = '\u0022';
		System.out.println(character);
		System.out.println(charEscape);
		System.out.println(charUnicode);
		
		// 문자열 리터럴 (String)
		String str = "Hello";
		System.out.println(str);
		
		// 논리 리터럴 (boolean)
		boolean boolTrue = true;
		boolean boolFalse = false;
		System.out.println(boolTrue);
		System.out.println(boolFalse);
	}
}
