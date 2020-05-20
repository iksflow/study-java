package training.enumeration;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class EnumExample {
	public static void main(String[] args) {
		System.out.println(ColorCode.GREEN);
		System.out.println(ColorCode.GREEN.ordinal());
		System.out.println(ColorCode.GREEN.name());
		System.out.println(ColorCode.GREEN.getColorCode());

		Map<String, String> map = new HashMap<>();
		map.put("001", "1");
		map.put("002", "2");
		map.put("003", "3");
		for (Entry<String, String> key : map.entrySet()) {
			System.out.println("Key::" + key.getKey());
			System.out.println("Value::" + key.getValue());
		}
		System.out.println(LocalDate.now().format(DateTimeFormatter.BASIC_ISO_DATE));

	}
}
