package training.standardapi;

import java.util.Arrays;

public class SearchExample {

	public static void main(String[] args) {
		// ±âº» Å¸ÀÔ°ª °Ë»ö
		int[] scores = { 99, 97, 98 };
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("Ã£Àº ÀÎµ¦½º: " + index);
		
		// ¹®ÀÚ¿­ °Ë»ö
		String[] names = { "È«±æµ¿", "¹Úµ¿¼ö", "±è¹Î¼ö" };
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "È«±æµ¿");
		System.out.println("Ã£Àº ÀÎµ¦½º: " + index);
		
		// °´Ã¼ °Ë»ö
		Member3 m1 = new Member3("È«±æµ¿");
		Member3 m2 = new Member3("¹Úµ¿¼ö");
		Member3 m3 = new Member3("±è¹Î¼ö");
		Member3[] members = { m1, m2, m3 };
		Arrays.sort(members);
		index = Arrays.binarySearch(members, m1);
		System.out.println("Ã£Àº ÀÎµ¦½º: " + index);
	}

}
