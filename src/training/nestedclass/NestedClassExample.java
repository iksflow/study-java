package training.nestedclass;

public class NestedClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NestedClass nc = new NestedClass();
		
		// �ν��Ͻ� ��� Ŭ���� ��ü ����
		NestedClass.A a = nc.new A();
		a.field1 = 3;
		a.method1();
		
		// ���� ��� Ŭ���� ��ü ����
		NestedClass.B b = new NestedClass.B();
		b.field1 = 3;
		b.method1();
		NestedClass.B.field2 = 3;
		NestedClass.B.method2();
		
		// ���� Ŭ���� ��ü������ ���� �޼ҵ� ȣ��
		nc.method();
	}

}
