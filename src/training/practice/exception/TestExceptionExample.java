package training.practice.exception;

public class TestExceptionExample {

	public static void main(String[] args) throws Exception {
		try {
			testMethod1();	
		} catch(Exception e) {
			throw e;
		}
	}
	
	public static void testMethod1() throws Exception {
		testInnerMethod();
	}

	public static void testInnerMethod() {
		try {
			throw new TestException("������ �߻��߽��ϴ�.");			
		} catch (Exception e) {
//			throw e;	// throw�ϸ� ������ �߻���.
		}
	}
}
