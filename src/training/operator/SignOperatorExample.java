package training.operator;

public class SignOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1= " + result1);	// +부호연산자는 값의 부호를 유지하기에 -100
		System.out.println("result2= " + result2);	// -부호연산자는 값의 부호를 변경하기에  100
		
		short s = 100;
//		short result3 = -s;	// 부호연산자의 산출결과는 int타입으로 반환하므로 short타입 변수에 저장할 수 없어서 컴파일에러가 난다.
		int result3 = -s;
		System.out.println("result3 = " + result3);
	}

}
