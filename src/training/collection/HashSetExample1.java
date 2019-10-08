package training.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		set.add("Java");
		set.add("JDBC");
		set.add("Servelet/JSP");
		set.add("Java");	// 이미 "Java"가 저장되어있다.
		set.add("iBatis");
		
		int size = set.size();
		System.out.println("총 객체수: " + size);
		
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		set.remove("JDBC");
		set.remove("iBatis");
		
		System.out.println("Final 총 객체수: " + set.size());
//		System.out.println("next2" + iterator.next());	// 이미 iterator는 hasNext()가 false이므로 실행했다가는 오류가 발생하게된다.
		/**
		 * iterator는 endpoint에 다다른 경우 재사용이 불가능하고 다시 선언해줘야한다. 
		 * 만약 계속해서 next()를 통해 값을 얻어내려 한다면 
		 * ConcurrentModificationException 에러가 발생하게된다.
		 */
		iterator = set.iterator();	
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.clear();
		if (set.isEmpty()) {
			System.out.println("비어있는 set");
		}
	}

}
