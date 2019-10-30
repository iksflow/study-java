package training.stream;

import java.util.ArrayList;
import java.util.List;

public class MaleStudent {
	private List<StudentNew> list;
	
	public MaleStudent() {
		list = new ArrayList<StudentNew>();
		System.out.println("[" + Thread.currentThread().getName() + "] MaleStudent()");
	}
	
	public void accumulate(StudentNew student) {
		list.add(student);
		System.out.println("[" + Thread.currentThread().getName() + "] accumulate()");
	}
	
	public void combine(MaleStudent other) {
		list.addAll(other.getList());
		System.out.println("[" + Thread.currentThread().getName() + "] combine()");
	}
	
	public List<StudentNew> getList() {
		return list;
	}
}
