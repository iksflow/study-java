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
			throw new TestException("에러가 발생했습니다.");			
		} catch (Exception e) {
//			throw e;	// throw하면 에러가 발생함.
		}
	}
}
