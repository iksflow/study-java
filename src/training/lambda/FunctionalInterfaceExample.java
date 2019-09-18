package training.lambda;

import java.util.function.Function;

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		Function<String, Integer> func = (a) -> { return 300;};
		
		System.out.println(func.apply("test"));
	}

}
