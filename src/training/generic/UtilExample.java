package training.generic;

public class UtilExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<String, Integer> pair = new Pair<>("ȫ�浿", 35);
		Integer age = Util.getValue(pair, "ȫ�浿");
		System.out.println(age);
		
		ChildPair<String, Integer> childPair = new ChildPair<>("ȫ���", 20);
		Integer childAge = Util.getValue(childPair, "ȫ���");
	}

}
