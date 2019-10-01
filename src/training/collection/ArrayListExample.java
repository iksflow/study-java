package training.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		
		// �迭�� ��� �߰�, ����, ����, ��ȸ
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
//		list.set(2, "Database-updated");
		list.remove(2);
		System.out.println(list.get(2));
		
		int size = list.size();
		
		// �ε����� �ʿ��� ��쿡�� for������ �ۼ�.
		for (int i = 0; i < size; i++) {
			System.out.println(list.get(i));
		}
		
		// �ε����� ���� �ʿ���°�� ���� for���� ����ϴ°��� ���ϴ�.
		for (String str : list) {
			System.out.println(str);
		}
	}

}
