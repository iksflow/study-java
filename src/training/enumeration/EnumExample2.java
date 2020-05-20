package training.enumeration;

public class EnumExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String RED = "RED";
		final String GREEN = "GREEN";
		getColorCode(RED);
		getColorCode(GREEN);
		getColorCode("ABC");	// ��� ���� ���� ����� �� �ִ�.
		getColorCodeFromEnum(ColorCode.RED);
//		getColorCodeFromEnum("AA"); // ���ǵ� Enum ���� �ٸ� ���� �Է��ϸ� �����Ͽ����� �߻��Ѵ�.
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
