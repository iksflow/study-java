package training.variableandtype;

public class FromIntToFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 123456780;
		int num2 = 123456780;
		
//		float num3 = num2;	// num3 != num2 가 되어버린다.
		double num3 = num2;	// 정밀도 손실을 피하기 위해선 int를 안전하게 담을 수 있는 double형으로 받아야한다.
		
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result);
		
	}
}
