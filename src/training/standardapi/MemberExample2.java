package training.standardapi;

public class MemberExample2 {

	public static void main(String[] args) {
		// 원본 객체
		int[] arr = {1, 2, 3};
		Member2 original = new Member2("blue", "홍길동", "12345", 25, true, new int[] {90, 90}, new Car("소나타"));
		
		// 복제 객체를 얻은 후에 패스워드 변경 및 깊은복제 항목들의 값 변경
		Member2 cloned = original.getMember();
		cloned.password = "67890";
		cloned.scores[0] = 100;	// 얕은복사가 된 부분이라 같이 바뀌어버린다.
		cloned.car.model = "그랜저";
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("id: " + cloned.id);
		System.out.println("name: " + cloned.name);
		System.out.println("password: " + cloned.password);
		System.out.println("age: " + cloned.age);
		System.out.println("adult: " + cloned.adult);
		System.out.println("arr[0]: " + cloned.scores[0]);
		System.out.println("arr[1]: " + cloned.scores[1]);
		System.out.println("car model: " + cloned.car.model);
		
		System.out.println();
		
		System.out.println("[원본 객체의 필드값]");
		System.out.println("id: " + original.id);
		System.out.println("name: " + original.name);
		System.out.println("password: " + original.password);
		System.out.println("age: " + original.age);
		System.out.println("arr[0]: " + original.scores[0]);
		System.out.println("arr[1]: " + original.scores[1]);
		System.out.println("car model: " + original.car.model);
	}

}
