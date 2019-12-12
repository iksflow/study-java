package training.nestedclass;

public class NestedClass {
	NestedClass(){
		System.out.println("외부객체 생성");
	}
	// 인스턴스 멤버 클래스
	class A {
		int field1;
		
		A() {
			System.out.println("내부 A 객체 생성");
		}
		void method1() {
			
		}
		/* 인스턴스 멤버 클래스에서 static은 선언 못함 */
//		static void method2() {}	
	}
	// 정적 멤버 클래스
	static class B {
		int field1;
		static int field2;
		B() {
			System.out.println("내부 B 객체 생성");
		}
		void method1() {}
		static void method2() {}
	}
	
	void method() {
		// 로컬 클래스
		class C {
			int field1;
//			static int field2;
			C() {
				System.out.println("내부 C 객체 생성");
			}
			void method1() {
				
			}
		}
		C c = new C();
		c.field1 = 3;
		c.method1();
	}
}
