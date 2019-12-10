package training.ch6_class;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PrintAnnotationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Service클래스로부터 메소드정보를 받아옴
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		Field[] declaredFields = Service.class.getDeclaredFields();
		
		// Method 객체를 하나씩 처리
		
		for (Method method : declaredMethods) {
			// PrintAnnotation이 적용되었는지 확인
			if (method.isAnnotationPresent(PrintAnnotation.class)) {
				// PrintAnnotation 객체 얻기
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				
				// 메소드 이름 출력
				System.out.println("[" + method.getName() + "]");
				
				// 구분선 출력
				for (int i = 0; i < printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();
				
				try {
					// 메소드 호출
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
		System.out.println("field 목록: " + sb.toString());
	}

}
