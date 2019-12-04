package training.ch8_class;

public class CalculatorExample {

	public static void main(String[] args) {
//		객체 생성 후 접근해도 되지만 권장되지 않는 방법이고, eclipse에서는 이렇게쓸거면 static 키워드를 빼라는 경고메세지를 보여준다.
//		Calculator cal = new Calculator();
//		double result1 = 10 * 10 * cal.pi;
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}

}
