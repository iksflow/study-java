package training.practice.exception;

public class TestRuntimeExceptionExample2 {

	public static void main(String[] args) {
//		throw new TestRuntimeException("������ �߻��߽��ϴ�.");
		try {
			testMethod();
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Main�޼����� catch���� ����ó���߽��ϴ�.");
		}
	}

	public static void testMethod() throws Exception {
		try {
			testThrowMethod();	
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("testMethod�� catch���� ����ó���߽��ϴ�.");
		}
	}
	
	public static void testThrowMethod() throws Exception {
		SampleUtil su = new SampleUtil();
		su.doSomething();
		throw new TestException("������ �߻��߽��ϴ�.");
	}
}
