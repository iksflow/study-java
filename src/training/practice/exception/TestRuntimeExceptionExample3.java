package training.practice.exception;

public class TestRuntimeExceptionExample3 {
	
	public static void main(String[] args) {
		
		try {
			testMethod();	
		} catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}
	
	public static void testMethod() throws ArithmeticException {
		throw new ArithmeticException("������ �߻��߽��ϴ�.");
	}

}
