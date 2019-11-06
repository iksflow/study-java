package training.polymorphism;

public class Programmer implements Job {
	private int pay;
	@Override
	public int getPay() {
		// TODO Auto-generated method stub
		return pay;
	}
	@Override
	public void setPay(int pay) {
		// TODO Auto-generated method stub
		this.pay = pay;
	}
}
