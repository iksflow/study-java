package training.practice.exception;

public class TestRuntimeExceptionExample2 {

	public static void main(String[] args) {
//		throw new TestRuntimeException("에러가 발생했습니다.");
		try {
			testMethod();
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Main메서드의 catch에서 예외처리했습니다.");
		}
	}

	public static void testMethod() throws Exception {
		try {
			testThrowMethod();	
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("testMethod의 catch에서 예외처리했습니다.");
		}
	}
	
	public static void testThrowMethod() throws Exception {
		SampleUtil su = new SampleUtil();
		su.doSomething();
		throw new TestException("에러가 발생했습니다.");
	}
}
