package training.sort;

import training.collection.ArrayListExample;

import java.util.*;

public class SortClassArrayExample {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
//        List<Student> list2 = new ArrayList<>();
        list.add(new Employee("인사팀", "김철수", 35));
        list.add(new Employee("총무팀", "박민호", 25));
        list.add(new Employee("기획팀", "홍길동", 30));

        System.out.println("원본 데이터 정렬상태");
        for (Employee emp : list) {
            System.out.println(emp);
        }

        

        System.out.println("나이 기준 오름차순으로 정렬");
        Collections.sort(list);
        for (Employee emp : list) {
            System.out.println(emp);
        }

        System.out.println("이름 기준 내림차순으로 정렬 ");
        Comparator<Employee> orderByNameDESC = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getName().compareTo(o1.getName());
            }
        };

        Collections.sort(list, orderByNameDESC);
        for (Employee emp : list) {
            System.out.println(emp);
        }

        System.out.println("부서명 기준 오름차순으로 정렬");
        Collections.sort(list, new SortByDeptASC());
        for (Employee emp : list) {
            System.out.println(emp);
        }

    }
}
