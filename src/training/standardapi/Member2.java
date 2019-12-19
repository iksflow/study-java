package training.standardapi;

import java.util.Arrays;

public class Member2 implements Cloneable {
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	// 깊은 복제 대상
	public int[] scores;	
	public Car car;

	public Member2(String id, String name, String password, int age, boolean adult, int[] scores, Car car) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
		this.scores = scores;
		this.car = car;
	}
	
	public Member2 getMember() {
		Member2 cloned = null;
		try {
			cloned = (Member2) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member2) {
			Member2 member = (Member2) obj;
			if (id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 먼저 얕은복사를 해서 name, age를 복제한다.
		Member2 cloned = (Member2) super.clone(); //Object의 clone 호출
		// scores를 깊은복제한다.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		// car를 깊은 복제한다.
		cloned.car = new Car(this.car.model);
		// 깊은 복제된 Member 객체를 리턴
		return cloned;
	}
}
