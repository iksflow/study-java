package training.stream;

import java.util.stream.IntStream;

public class FromIntRangeExample {
	public static int sum = 0;
	public static int openSum = 0;
	public static void main(String[] args) {
		IntStream stream = IntStream.rangeClosed(1, 100);
		stream.forEach(a -> sum += a);
		System.out.println("รัวี : " + sum);
		
		IntStream openStream = IntStream.range(1, 100);
		openStream.forEach(a -> openSum += a);
		System.out.println("รัวี : " + openSum);
		
	}

}
