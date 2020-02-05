package training.practice;

public class BinaryPrinter {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(String.format("%32s",Integer.toBinaryString(Integer.MIN_VALUE)).replace(" ", "0"));
		sb.reverse();
		int count = sb.length();
		while(0 < count - 4) {
			count = count - 4;
			sb.insert(count, " ");	
		}
		sb.reverse();
		System.out.println(sb);
	}
}
