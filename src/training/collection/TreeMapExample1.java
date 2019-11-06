package training.collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(new Integer(87),  "ȫ�浿");
		scores.put(new Integer(98), "�̵���");
		scores.put(new Integer(75), "�ڱ��");
		scores.put(new Integer(95), "�ſ��");
		scores.put(new Integer(80), "���ڹ�");
		
		Map.Entry<Integer, String> entry = null;
		
		entry = scores.firstEntry();
		System.out.println("���� ���� ����: " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.lastEntry();
		System.out.println("���� ���� ����: " + entry.getKey() + "-" + entry.getValue() + "\n");
		
		entry = scores.lowerEntry(new Integer(95));
		System.out.println("95�� �ٷ� �Ʒ� ����: " + entry.getKey() + "-" + entry.getValue() + "\n");
		
		entry = scores.higherEntry(new Integer(95));
		System.out.println("95�� �ٷ� ���� ����: " + entry.getKey() + "-" + entry.getValue() + "\n");
		
		entry = scores.floorEntry(new Integer(95));
		System.out.println("95�� �̰ų� �ٷ� �Ʒ� ����: " + entry.getKey() + "-" + entry.getValue() + "\n");
		
		entry = scores.ceilingEntry(new Integer(85));
		System.out.println("95�� �̰ų� �ٷ� ���� ����: " + entry.getKey() + "-" + entry.getValue() + "\n");
		
		while(!scores.isEmpty()) {
			entry = scores.pollFirstEntry();
			System.out.println(String.format("%d - %s  (������ü��: %d)", entry.getKey(), entry.getValue(), scores.size()));
		}
	}

}