package training.collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("apple");
		treeSet.add("forever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("cherry");
		treeSet.add("f");
		
		System.out.println("[c~f ������ �ܾ� �˻�]");
		// forever�� fo �̹Ƿ� ������ �ʴ´�. 2, 4��°�� boolean���� ���ۿ���, �� ���Ҹ� �������� ���ο����� �ٸ��Ի���Ѵ�.  
		NavigableSet<String> rangeSet = treeSet.subSet("c",  true, "f", true);
		for(String word : rangeSet) {
			System.out.println(word);
		}
		
	}

}
