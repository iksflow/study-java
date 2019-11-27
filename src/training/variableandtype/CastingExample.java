package training.variableandtype;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);	// 유니코드값에 해당하는 문자가 출력됨.
		
//		long longValue = 500;
		long longValue = Long.MAX_VALUE;
		intValue = (int) longValue;
		System.out.println(intValue);	// 500은 int에서 허용가능한 범위이기때문에 강제변환이 가능. 
		// 하지만 MAX_VALUE를 담는다면 음수로 변해버려 이상한값이나오게된다 
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);	// 소수점 부분을 버리고 정수부를 출력한다.
	}

}
