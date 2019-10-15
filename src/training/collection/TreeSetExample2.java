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
		
		// descendingIterator를 사용해서 내림차순으로 출력하는 방식
		Iterator iter = scores.descendingIterator();
		while(iter.hasNext()) {
			System.out.println(iter.next() + " ");
		}
		System.out.println();
		
		// descendingSet() 메소드로 NavigableSet을 반환받아 내림차순으로 정렬되었음을 확인하는 방식
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		for (Integer score : descendingSet) {
			System.out.println(score + " ");
		}
		System.out.println();
		
		// descendingSet() 메소드를 두번 사용하여 오름차순 결과까지 얻어낸 모습
		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
		for (Integer score : ascendingSet) {
			System.out.println(score + " ");
		}

	}

}
