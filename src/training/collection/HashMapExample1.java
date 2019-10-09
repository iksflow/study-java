package training.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Set;

public class HashMapExample1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("±èÀÚ¹Ù", 85);
		map.put("¹ÚÆÄÀÌ½ã", 90);
		map.put("ÃÖ¾¾¼¥", 80);
		map.put("¹ÚÆÄÀÌ½ã", 95);
		
		System.out.println("ÃÑ Entry ¼ö : " + map.size());
		
		System.out.println("\t¹ÚÆÄÀÌ½ã : " + map.get("¹ÚÆÄÀÌ½ã"));
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t " + key + " : " + value);
		}
		
		map.remove("±èÀÚ¹Ù");
		System.out.println("ÃÑ Entry ¼ö : " + map.size());
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		
		System.out.println("clear map");
		map.clear();
		
		System.out.println("ÃÑ Entry ¼ö : " + map.size());
		
	}

}
