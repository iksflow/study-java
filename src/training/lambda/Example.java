package training.lambda;

public class Example {
	public static void main(String[] args) {
		MyNormalInterface mni = (a, b) -> a + b;
		MyFunctionalInterface mfi = (a, b) -> a + b;
		
		System.out.println("Normal:: " + mni.sum(1, 3));
		System.out.println("Functional:: " + mfi.sum(1, 3));
	}
}
