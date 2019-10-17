package training.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 이렇게 작성하는 경우 Fruit 객체는 Comparable 인터페이스를 구현하지 않았기때문에 ClassCastExeption이 발생한다.
		 * TreeSet<Fruit> treeSet = new TreeSet<Fruit>();
		 * treeSet.add(new Fruit("포도", 3000));
		 * treeSet.add(new Fruit("수박", 10000));
		 * treeSet.add(new Fruit("딸기", 6000));
		*/
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator());
		
		treeSet.add(new Fruit("포도", 3000));
		treeSet.add(new Fruit("수박", 10000));
		treeSet.add(new Fruit("딸기", 6000));
		
		Iterator<Fruit> iterator = treeSet.iterator();
		
		while(iterator.hasNext()) {
			Fruit fruit = iterator.next();
			System.out.println(fruit.name + " : " + fruit.price);
		}
	}

}
