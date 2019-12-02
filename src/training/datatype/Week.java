package training.datatype;

public enum Week {
	MONDAY("mon", 0),
	TUESDAY("tue", 1),
	WEDNESDAY("wed", 2),
	THURSDAY("thu", 3),
	FRIDAY("fri", 4),
	SATURDAY("sat", 5),
	SUNDAY("sun", 6);
	private String shortName;
	private int order;
	
	Week(String a, int b) {
		this.shortName = a;
		this.order = b;
	}
	
	public String getShortName() {
		return shortName;
	}
	
	public int getOrder() {
		return order;
	}
}
