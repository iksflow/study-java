package training.standardapi;

public class MemberExample2 {

	public static void main(String[] args) {
		// 원본 객체
		int[] arr = {1, 2, 3};
		Member2 original = new Member2("blue", "홍길동", "12345", 25, true, new int[] {1,2,3});
		
		// 복제 객체를 얻은 후에 패스워드 변경
		Member2 cloned = original.getMember();
		cloned.password = "67890";
		cloned.arr[0] = 5;	// 얕은복사가 된 부분이라 같이 바뀌어버림.
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("id: " + cloned.id);
		System.out.println("name: " + cloned.name);
		System.out.println("password: " + cloned.password);
		System.out.println("age: " + cloned.age);
		System.out.println("adult: " + cloned.adult);
		System.out.println("arr[0]: " + cloned.arr[0]);
		System.out.println("arr[1]: " + cloned.arr[1]);
		System.out.println("arr[2]: " + cloned.arr[2]);
		
		System.out.println();
		
		System.out.println("[원본 객체의 필드값]");
		System.out.println("id: " + original.id);
		System.out.println("name: " + original.name);
		System.out.println("password: " + original.password);
		System.out.println("age: " + original.age);
		System.out.println("arr[0]: " + original.arr[0]);
		System.out.println("arr[1]: " + original.arr[1]);
		System.out.println("arr[2]: " + original.arr[2]);
	}

}
