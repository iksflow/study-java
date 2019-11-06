package training.variable;

public class GarbageValueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte var1 = 125;
		int var2 = 125;
		for (int i = 0; i < 5; i++) {
			var1++;
			var2++;
			System.out.println(String.format("var1 : %d\t var2 : %d", var1, var2));
		}
	}

}
