package training.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		
		// 배열의 요소 추가, 삭제, 수정, 조회
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
//		list.set(2, "Database-updated");
		list.remove(2);
		System.out.println(list.get(2));
		
		int size = list.size();
		
		// 인덱스가 필요한 경우에는 for문으로 작성.
		for (int i = 0; i < size; i++) {
			System.out.println(list.get(i));
		}
		
		// 인덱스가 딱히 필요없는경우 향상된 for문을 사용하는것이 편리하다.
		for (String str : list) {
			System.out.println(str);
		}
	}

}
