package training.practice.exception;

public class TestRuntimeExceptionExample {

	public static void main(String[] args) {
//		throw new TestException("������ �߻��߽��ϴ�.");
//		throw new TestRuntimeException("������ �߻��߽��ϴ�.");
		testMethod();
	}
	
	public static void testMethod() {
//		throw new TestRuntimeException("������ �߻��߽��ϴ�.");
		testInnerMethod();
	}
	
	public static void testInnerMethod() {
		try {
			SampleUtil su = new SampleUtil();
			su.doSomething();
			throw new TestRuntimeException("������ �߻��߽��ϴ�.");	
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
