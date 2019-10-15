package training.collection;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));
		
		// descendingIterator�� ����ؼ� ������������ ����ϴ� ���
		Iterator iter = scores.descendingIterator();
		while(iter.hasNext()) {
			System.out.println(iter.next() + " ");
		}
		System.out.println();
		
		// descendingSet() �޼ҵ�� NavigableSet�� ��ȯ�޾� ������������ ���ĵǾ����� Ȯ���ϴ� ���
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		for (Integer score : descendingSet) {
			System.out.println(score + " ");
		}
		System.out.println();
		
		// descendingSet() �޼ҵ带 �ι� ����Ͽ� �������� ������� �� ���
		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
		for (Integer score : ascendingSet) {
			System.out.println(score + " ");
		}

	}

}
