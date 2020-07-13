package training.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("인사팀", "김철수", 35));
        list.add(new Employee("총무팀", "박민호", 25));
        list.add(new Employee("기획팀", "홍길동", 30));

        Employee emp = new Employee("비서팀", "테스트", 27);

        Object[] objList = list.toArray();

        for (Object obj : objList) {
            Comparable comp = (Comparable) obj;
            System.out.println(comp.compareTo(emp));
        }
    }
}
