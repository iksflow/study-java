package training.enumeration;

public enum ColorCode {
	RED( "#FF0000", 1),
	BLUE( "#0000FF", 2),
	GREEN( "#008000", 3);
	
	private String colorCode;
	private int orderSq;
	
	ColorCode(String colorCode, int orderSq) {
		this.colorCode = colorCode;
		this.orderSq = orderSq;
	}

	public String getColorCode() {
		return colorCode;
	}

	public void setColorCode(String colorCode) {
		this.colorCode = colorCode;
	}

	public int getOrderSq() {
		return orderSq;
	}

	public void setOrderSq(int orderSq) {
		this.orderSq = orderSq;
	}
}
