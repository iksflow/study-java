package training.practice;

public class BinaryPrinter {
	public static void main(String[] args) {
		System.out.println(spliter(String.format("%32s",Integer.toBinaryString(Integer.MAX_VALUE)).replace(" ", "0"), 4, " "));
		System.out.println(spliter("abcdefg", 2, " "));
	}
	
	public static String spliter(String s, int len, String delimiter) {
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		int count = sb.length() - len;
		while(0 < count) {
			sb.insert(count, delimiter);
			count = count - len;
		}
		sb.reverse();
		return sb.toString();
	}
}
