package training.polymorphism;

public class PolyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Job student = new Student();
		Job prog = new Programmer();
		Student student2 = new Student();
		
		getPay(student);
		getPay(prog);
		getPay(student2);
		getPay2(student);
		
//		List<String> list = new ArrayList<String>();
//		List<String> list2 = new LinkedList<String>();
//		ArrayList<String> list3 = new ArrayList<String>();
//		getLength(list);
		
	}
	
	public static int getPay2(Object obj) {
		if (obj instanceof Student) {
			Student std = (Student)obj;
			std.getPay();
		}
		return 0;
	}
	
	public static int getPay(Job job) {
		int pay = job.getPay();
		return pay;
	}
	
	public static void getClassName(Student stu) {
		System.out.println(stu.className);
	}
	
//	public static int getLength(ArrayList list) {
//		return list.size();
//	};
//	
//	public static void doMixer() {
//		
//	}
}
