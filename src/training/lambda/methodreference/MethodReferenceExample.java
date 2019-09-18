package training.lambda.methodreference;

import java.util.function.IntBinaryOperator;

public class MethodReferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntBinaryOperator operator;
		
		// ���� �޼ҵ� ����
		operator = (x, y) -> Calculator.staticMethod(x, y);
		System.out.println("���1: " + operator.applyAsInt(1, 2));
		
		operator = Calculator :: staticMethod;
		System.out.println("���2: " + operator.applyAsInt(3, 4));
		
		// �ν��Ͻ� �޼ҵ� ����
		Calculator cal = new Calculator();
		operator = (x, y) -> cal.instanceMethod(x, y); 
		System.out.println("���3: " + operator.applyAsInt(5, 6));
		
		operator = cal :: instanceMethod;
		System.out.println("���4: " + operator.applyAsInt(7,  8));
	}

}
