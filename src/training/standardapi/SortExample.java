package training.standardapi;

import java.util.Arrays;

public class SortExample {

	public static void main(String[] args) {
		int[] scores = { 99, 97, 98 };
		Arrays.sort(scores);
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "] = " + scores[i]);
		}
		System.out.println();
		
		String[] names = { "È«±æµ¿", "¹Úµ¿¼ö", "±è¹Î¼ö" };
		Arrays.sort(names);
		for (int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "] = " + names[i]);
		}
		System.out.println();
		
		Member3 m1 = new Member3("È«±æµ¿");
		Member3 m2 = new Member3("¹Úµ¿¼ö");
		Member3 m3 = new Member3("±è¹Î¼ö");
		Member3[] members = { m1, m2, m3 };
		Arrays.sort(members);
		for (int i = 0; i < members.length; i++) {
			System.out.println("members[" + i + "] = " + members[i].name);
		}
		
	}

}
