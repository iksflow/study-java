package training.nestedclass;

public class Outter1 {
	// 자바 7 이전
	public void method1(final int arg) {
		final int localVariable = 1;
		// final이므로 수정이 불가능하다.
		// arg = 100; (x)
		// localVariable = 100; (x)
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	// 자바 8 이후
	public void method2(int arg) {
		int localVariable = 1;
		// arg = 100; (x)
		// localVariable = 100; (x)
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
