package training.nestedclass;

public class NestedClass {
	NestedClass(){
		System.out.println("�ܺΰ�ü ����");
	}
	// �ν��Ͻ� ��� Ŭ����
	class A {
		int field1;
		
		A() {
			System.out.println("���� A ��ü ����");
		}
		void method1() {
			
		}
		/* �ν��Ͻ� ��� Ŭ�������� static�� ���� ���� */
//		static void method2() {}	
	}
	// ���� ��� Ŭ����
	static class B {
		int field1;
		static int field2;
		B() {
			System.out.println("���� B ��ü ����");
		}
		void method1() {}
		static void method2() {}
	}
	
	void method() {
		// ���� Ŭ����
		class C {
			int field1;
//			static int field2;
			C() {
				System.out.println("���� C ��ü ����");
			}
			void method1() {
				
			}
		}
		C c = new C();
		c.field1 = 3;
		c.method1();
	}
}
