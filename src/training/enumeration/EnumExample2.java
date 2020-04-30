package training.enumeration;

public class EnumExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String RED = "RED";
		final String GREEN = "GREEN";
		getColorCode(RED);
		getColorCode(GREEN);
		getColorCode("ABC");	// 상수 외의 값이 끼어들 수 있다.
		getColorCodeFromEnum(ColorCode.RED);
//		getColorCodeFromEnum("AA"); // 정의된 Enum 외의 다른 값을 입력하면 컴파일에러가 발생한다.
	}
	
	public static String getColorCode(String colorName) {
		String colorCode = "";
		switch(colorName) {
			case "RED":
				colorCode = "#FF0000";
				break;
			case "GREEN":
				colorCode = "#008000";
				break;
			default:
		}
		return colorCode;
	}
	
	public static String getColorCodeFromEnum(ColorCode colorName) {
		
		return colorName.getColorCode();
	}

}
