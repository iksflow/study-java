package training.nestedclass;

public class Outter2Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outter2 outter = new Outter2();
		Outter2.Nested nested = outter.new Nested();
		nested.print();
	}

}
