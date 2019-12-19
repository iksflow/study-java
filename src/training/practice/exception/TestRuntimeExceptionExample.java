package training.practice.exception;

public class TestRuntimeExceptionExample {

	public static void main(String[] args) {
//		throw new TestException("에러가 발생했습니다.");
//		throw new TestRuntimeException("에러가 발생했습니다.");
		testMethod();
	}
	
	public static void testMethod() {
//		throw new TestRuntimeException("에러가 발생했습니다.");
		testInnerMethod();
	}
	
	public static void testInnerMethod() {
		try {
			SampleUtil su = new SampleUtil();
			su.doSomething();
			throw new TestRuntimeException("에러가 발생했습니다.");	
		} catch(Exception e) {
			try {
				throw e;
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
		}
	}

}
