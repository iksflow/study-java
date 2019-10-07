package training.collection;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = Arrays.asList("È«±æµ¿", "½Å¿ë±Ç", "±èÀÚ¹Ù");
		for (String name : list1) {
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(1, 2, 3);
		for (Integer number : list2) {
			System.out.println(number);
		}
	}

}
