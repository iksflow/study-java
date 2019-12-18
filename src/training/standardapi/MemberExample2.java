package training.standardapi;

public class MemberExample2 {

	public static void main(String[] args) {
		// ���� ��ü
		int[] arr = {1, 2, 3};
		Member2 original = new Member2("blue", "ȫ�浿", "12345", 25, true, new int[] {1,2,3});
		
		// ���� ��ü�� ���� �Ŀ� �н����� ����
		Member2 cloned = original.getMember();
		cloned.password = "67890";
		cloned.arr[0] = 5;	// �������簡 �� �κ��̶� ���� �ٲ�����.
		
		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("id: " + cloned.id);
		System.out.println("name: " + cloned.name);
		System.out.println("password: " + cloned.password);
		System.out.println("age: " + cloned.age);
		System.out.println("adult: " + cloned.adult);
		System.out.println("arr[0]: " + cloned.arr[0]);
		System.out.println("arr[1]: " + cloned.arr[1]);
		System.out.println("arr[2]: " + cloned.arr[2]);
		
		System.out.println();
		
		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("id: " + original.id);
		System.out.println("name: " + original.name);
		System.out.println("password: " + original.password);
		System.out.println("age: " + original.age);
		System.out.println("arr[0]: " + original.arr[0]);
		System.out.println("arr[1]: " + original.arr[1]);
		System.out.println("arr[2]: " + original.arr[2]);
	}

}
