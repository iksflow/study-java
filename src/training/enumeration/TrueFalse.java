package training.enumeration;

public enum TrueFalse {
	TRUE( "T", "1", "Y"),
	FALSE( "F", "2", "N");
	
	private String tf1;
	private String tf2;
	private String tf3;
	
	TrueFalse(String tf1, String tf2, String tf3) {
		this.tf1 = tf1;
		this.tf2 = tf2;
		this.tf3 = tf3;
	}

	public String getTf1() {
		return tf1;
	}

	public void setTf1(String tf1) {
		this.tf1 = tf1;
	}

	public String getTf2() {
		return tf2;
	}

	public void setTf2(String tf2) {
		this.tf2 = tf2;
	}

	public String getTf3() {
		return tf3;
	}

	public void setTf3(String tf3) {
		this.tf3 = tf3;
	}
}
