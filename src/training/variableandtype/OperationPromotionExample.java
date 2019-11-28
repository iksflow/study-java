package training.variableandtype;

public class OperationPromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue1 = 10;
		byte byteValue2 = 20;
//		byte byteValue3 = byteValue1 + byteValue2;	 
//		자바에서는 정수연산을 int타입을 기본으로 하기때문에 4byte보다 작은 타입(byte, char, short)는 int 타입으로 변환해서 연산하고
//		연산의 결과도 int타입이 된다. 위 코드는 byte에 4byte int를 저장할 수 없기에 컴파일 오류가 발생한다.
		byte byteValue3 = (byte)(byteValue1 + byteValue2);
		
		System.out.println(byteValue3);
		
		char charValue1 = 'A';
		char charValue2 = 1;
//		char charValue3 = charValue1 + charValue2;
		char charValue3 = (char)(charValue1 + charValue2);
//		위의 byte 예제와 같은 이유로 오류가 발생한다.
		
		System.out.println(charValue3);
		
		int intValue1 = 10;
		int intValue2 = intValue1/4;
		System.out.println(intValue2);
		
		int intValue3 = 10;
//		int intValue4 = 10 / 4.0;
//		int 와 double의 연산이므로 double의 타입으로 자동변환되어 연산하기에 double타입이 반환이 된다.
//		10 / 4.0의 결과값을 담으려면 double 타입 이상의 크기를 가져야한다.
		double doubleValue1 = intValue3 / 4.0;
		System.out.println(doubleValue1);
	}

}
