package training.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Person ��ü�� Comparable �������̽��� ���������Ƿ� treeSet�� ������ �� �ִ�.
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		treeSet.add(new Person("ȫ�浿", 45));
		treeSet.add(new Person("���ڹ�", 25));
		treeSet.add(new Person("������", 31));
		
		Iterator<Person> iterator = treeSet.iterator();
		
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + ":" + person.age);
		}
		/**
		 *	Fruit ��ü�� Comparable �������̽��� �������� �ʾƼ� �ٷ� treeSet�� �����ϴ� ��� ������ �߻��Ѵ�.
		 *	ClassCastException ���� �߻�. 
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
