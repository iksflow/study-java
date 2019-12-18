package training.standardapi;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		// Key ��ü�� �ĺ�Ű�� ����ؼ� String ���� �����ϴ� hashMap ��ü ����
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		// �ĺ�Ű "new Key(1)"�� "ȫ�浿"�� ������
		hashMap.put(new Key(1), "ȫ�浿");
		
		// �ĺ�Ű "new Key(1)"�� "ȫ�浿"�� �о��
		String value = hashMap.get(new Key(1));
		System.out.println(value);
		
		Key k1 = new Key(3);
		Key k2 = new Key(3);
		
		System.out.println("k1 hashCode : " + k1.hashCode());
		System.out.println("k2 hashCode : " + k2.hashCode());
		
		System.out.println("k1 address : " + k1);
		System.out.println("k2 address : " + k2);
		System.out.println("k1 == k2 : " + (k1 == k2));
	}

}
