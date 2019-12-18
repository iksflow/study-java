package training.standardapi;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		// Key 객체를 식별키로 사용해서 String 값을 저장하는 hashMap 객체 생성
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		// 식별키 "new Key(1)"로 "홍길동"을 저장함
		hashMap.put(new Key(1), "홍길동");
		
		// 식별키 "new Key(1)"로 "홍길동"을 읽어옴
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
