package training.generic;

public class GenericPracticeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxUsingGeneric<Integer> box = new BoxUsingGeneric<Integer>();
		Integer item = 6;
		box.setItem(item);
		Integer result = box.getItem();
	}

}
