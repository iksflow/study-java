package training.generic;

import java.util.ArrayList;

public class ProductExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildProduct cp = new ChildProduct();
		int a = 123;
		double b = 1.56;
		cp.setKindList(new ArrayList<Integer>());
		cp.getKindList().add(a);
		cp.getKindList().add(b);
		Integer temp1 = (Integer)cp.getKindList().get(0);
		Double temp2 = (Double)cp.getKindList().get(1);
		
		
	}
}
