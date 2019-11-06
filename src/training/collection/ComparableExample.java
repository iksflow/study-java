package training.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Person 객체는 Comparable 인터페이스를 구현했으므로 treeSet에 저장할 수 있다.
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("감자바", 25));
		treeSet.add(new Person("박지원", 31));
		
		Iterator<Person> iterator = treeSet.iterator();
		
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + ":" + person.age);
		}
		/**
		 *	Fruit 객체는 Comparable 인터페이스를 구현하지 않아서 바로 treeSet에 저장하는 경우 오류가 발생한다.
		 *	ClassCastException 에러 발생. 
		 */
		 
		TreeSet<Fruit> treeSet2 = new TreeSet<Fruit>();
		treeSet2.add(new Fruit("cherry", 300));
		treeSet2.add(new Fruit("apple", 200));
		treeSet2.add(new Fruit("grape", 100));
		
		Iterator<Fruit> iterator2 = treeSet2.iterator();
		
		while(iterator2.hasNext()) {
			Fruit fruit = iterator2.next();
			System.out.println(fruit.name + ":" + fruit.price);
		}
	}

}
