package training.polymorphism;

public class Student implements Job {
	private int pay;
	public int className;
	private int sno;
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
