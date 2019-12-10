package training.ch6_class;

public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("123456-1234567", "±èµûÄá");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		Integer.parseInt("0");
//		p1.nation = "Japan"; finalÀº ¼öÁ¤ ºÒ°¡
		p1.name = "±è´ö¹è";
	}

}
