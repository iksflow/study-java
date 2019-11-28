package training.operator;

public class OverflowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		System.out.println(z);	// int의 저장범위를 초과한 값이 들어와 쓰레기값이 나오게된다.
		
		long a = 1000000;
		long b = 1000000;
		long c = a * b;
		System.out.println(c);	// long 타입에는 저장이 가능하므로 정상적인 값이 출력되게 된다.
	}

}
