package training.reflection;

import java.lang.reflect.Field;

public class ClassLoadExample {
	public static void main(String[] args) {
		for (Field field : Member.class.getDeclaredFields()) {
			System.out.println(field.getName());
		}
	}
}
