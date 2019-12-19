package training.standardapi;

public class MemberExample2 {

	public static void main(String[] args) {
		// ���� ��ü
		int[] arr = {1, 2, 3};
		Member2 original = new Member2("blue", "ȫ�浿", "12345", 25, true, new int[] {90, 90}, new Car("�ҳ�Ÿ"));
		
		// ���� ��ü�� ���� �Ŀ� �н����� ���� �� �������� �׸���� �� ����
		Member2 cloned = original.getMember();
		cloned.password = "67890";
		cloned.scores[0] = 100;	// �������簡 �� �κ��̶� ���� �ٲ�������.
		cloned.car.model = "�׷���";
		
		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("id: " + cloned.id);
		System.out.println("name: " + cloned.name);
		System.out.println("password: " + cloned.password);
		System.out.println("age: " + cloned.age);
		System.out.println("adult: " + cloned.adult);
		System.out.println("arr[0]: " + cloned.scores[0]);
		System.out.println("arr[1]: " + cloned.scores[1]);
		System.out.println("car model: " + cloned.car.model);
		
		System.out.println();
		
		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("id: " + original.id);
		System.out.println("name: " + original.name);
		System.out.println("password: " + original.password);
		System.out.println("age: " + original.age);
		System.out.println("arr[0]: " + original.scores[0]);
		System.out.println("arr[1]: " + original.scores[1]);
		System.out.println("car model: " + original.car.model);
	}

}
