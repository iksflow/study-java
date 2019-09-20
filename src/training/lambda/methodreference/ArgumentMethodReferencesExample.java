package training.lambda.methodreference;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferencesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToIntBiFunction<String, String> function;
		
		function = (a, b) -> a.compareToIgnoreCase(b);
		print(function.applyAsInt("Java8", "Jai"));
		
		function = String :: compareToIgnoreCase;
		print(function.applyAsInt("Java8", "JAVA8"));
	}
	
	public static void print(int order) {
		if (order < 0) { System.out.println("���������� ���� �ɴϴ�."); }
		else if (order == 0) { System.out.println("������ ���ڿ� �Դϴ�."); }
		else { System.out.println("���������� ���߿� �ɴϴ�."); }
	}
}
