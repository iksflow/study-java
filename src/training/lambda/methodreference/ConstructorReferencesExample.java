package training.lambda.methodreference;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferencesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Member> supplier1 = Member :: new;
		Member member1 = supplier1.get();
		Function<String, Member> function1 = Member :: new;
		Member member2 = function1.apply("angel");
		BiFunction<String, String, Member> function2 = Member :: new;
		Member member3 = function2.apply("angel", "Park");
	}

}
