package training.collection;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		treeMap.put("apple", new Integer(10));
		treeMap.put("forever", new Integer(60));
		treeMap.put("description", new Integer(40));
		treeMap.put("ever", new Integer(50));
		treeMap.put("zoo", new Integer(20));
		treeMap.put("base", new Integer(70));
		treeMap.put("guess", new Integer(30));
		treeMap.put("cherry", new Integer(80));
		
		NavigableMap<String, Integer> rangeMap = treeMap.subMap("c", true, "f", true);
		
		for(Map.Entry<String, Integer> entry : rangeMap.entrySet()) {
			System.out.println(String.format("%s : %d",  entry.getKey(), entry.getValue()));
		}
	}

}
