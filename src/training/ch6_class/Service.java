package training.ch6_class;

public class Service {
	@PrintAnnotation
	private String elem1;
	private String elem2;
	@PrintAnnotation
	public void method1() {
		System.out.println("���� ����1");
	}
	@PrintAnnotation("*")
	public void method2() {
		System.out.println("���� ����2");
	}
	@PrintAnnotation(value="#", number=20)
	public void method3() {
		System.out.println("���� ����3");
	}
}
