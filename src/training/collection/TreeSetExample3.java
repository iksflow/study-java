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
		
		System.out.println("[c~f 사이의 단어 검색]");
		// forever는 fo 이므로 나오지 않는다. 2, 4번째의 boolean값은 시작원소, 끝 원소를 포함할지 여부에따라 다르게사용한다.  
		NavigableSet<String> rangeSet = treeSet.subSet("c",  true, "f", true);
		for(String word : rangeSet) {
			System.out.println(word);
		}
		
	}

}
