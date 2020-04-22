package training.regex.enums;

public enum RegexpFormat {
	CELLPHONE(""),
	BIRTH(""),
	JUMIN("");
	
	private String regExp;

	private RegexpFormat(String regExp) {
		this.regExp = regExp;
	}
	public String getRegExp() {
		return regExp;
	}
}
