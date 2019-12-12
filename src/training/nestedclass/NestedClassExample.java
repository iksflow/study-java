package training.nestedclass;

public class NestedClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NestedClass nc = new NestedClass();
		
		// 인스턴스 멤버 클래스 객체 생성
		NestedClass.A a = nc.new A();
		a.field1 = 3;
		a.method1();
		
		// 정적 멤버 클래스 객체 생성
		NestedClass.B b = new NestedClass.B();
		b.field1 = 3;
		b.method1();
		NestedClass.B.field2 = 3;
		NestedClass.B.method2();
		
		// 로컬 클래스 객체생성을 위한 메소드 호출
		nc.method();
	}

}
