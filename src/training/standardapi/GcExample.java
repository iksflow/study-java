package training.standardapi;

public class GcExample {

	public static void main(String[] args) {
		Employee emp;
		
		emp = new Employee(1);
		emp = null;
		emp = new Employee(2);
		emp = null;
		emp = new Employee(3);
		
		System.out.println("emp�� ���������� �����ϴ� �����ȣ");
		System.out.println(emp.eno);
		System.gc();
	}
	
	static class Employee {
		public int eno;

		public Employee(int eno) {
			this.eno = eno;
			System.out.println("Employee(" + eno + ") �� �޸𸮿��� ������" );
		}

		@Override
		protected void finalize() throws Throwable {
			System.out.println("Employee(" + eno + ") �� �޸𸮿��� ���ŵ�" );
		}
	}

}
