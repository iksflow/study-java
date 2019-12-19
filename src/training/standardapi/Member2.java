package training.standardapi;

import java.util.Arrays;

public class Member2 implements Cloneable {
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	// ���� ���� ���
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
		// ���� �������縦 �ؼ� name, age�� �����Ѵ�.
		Member2 cloned = (Member2) super.clone(); //Object�� clone ȣ��
		// scores�� ���������Ѵ�.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		// car�� ���� �����Ѵ�.
		cloned.car = new Car(this.car.model);
		// ���� ������ Member ��ü�� ����
		return cloned;
	}
}
