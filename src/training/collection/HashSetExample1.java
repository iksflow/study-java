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
		set.add("Java");	// �̹� "Java"�� ����Ǿ��ִ�.
		set.add("iBatis");
		
		int size = set.size();
		System.out.println("�� ��ü��: " + size);
		
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		set.remove("JDBC");
		set.remove("iBatis");
		
		System.out.println("Final �� ��ü��: " + set.size());
//		System.out.println("next2" + iterator.next());	// �̹� iterator�� hasNext()�� false�̹Ƿ� �����ߴٰ��� ������ �߻��ϰԵȴ�.
		/**
		 * iterator�� endpoint�� �ٴٸ� ��� ������ �Ұ����ϰ� �ٽ� ����������Ѵ�. 
		 * ���� ����ؼ� next()�� ���� ���� ���� �Ѵٸ� 
		 * ConcurrentModificationException ������ �߻��ϰԵȴ�.
		 */
		iterator = set.iterator();	
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.clear();
		if (set.isEmpty()) {
			System.out.println("����ִ� set");
		}
	}

}
