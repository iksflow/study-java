package training.ch6_class;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PrintAnnotationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ServiceŬ�����κ��� �޼ҵ������� �޾ƿ�
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		Field[] declaredFields = Service.class.getDeclaredFields();
		
		// Method ��ü�� �ϳ��� ó��
		
		for (Method method : declaredMethods) {
			// PrintAnnotation�� ����Ǿ����� Ȯ��
			if (method.isAnnotationPresent(PrintAnnotation.class)) {
				// PrintAnnotation ��ü ���
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				
				// �޼ҵ� �̸� ���
				System.out.println("[" + method.getName() + "]");
				
				// ���м� ���
				for (int i = 0; i < printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();
				
				try {
					// �޼ҵ� ȣ��
					method.invoke(new Service());
				} catch (Exception e) {
					
				}
				System.out.println();
			}
		}
		StringBuilder sb = new StringBuilder();
		for (Field field : declaredFields) {
			if (field.isAnnotationPresent(PrintAnnotation.class)) {
				sb.append("@").append(field.getName()).append(", ");	
			} else {
				sb.append(field.getName()).append(", ");	
			}
		}
		System.out.println("field ���: " + sb.toString());
	}

}
