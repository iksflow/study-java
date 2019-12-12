package training.inheritance;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		for (int i = 0; i <= 5; i++) {
			int problemLocation = car.run();
			switch(problemLocation) {
				case 1:
					System.out.println("�տ��� HankookTire�� ��ü");
					car.frontLeftTire = new HankookTire("�տ���", 15);
					break;
				case 2:
					System.out.println("�տ����� KumhoTire�� ��ü");
					car.frontLeftTire = new KumhoTire("�տ�����", 13);
					break;
				case 3:
					System.out.println("�ڿ��� HankookTire�� ��ü");
					car.frontLeftTire = new HankookTire("�ڿ���", 14);
					break;
				case 4:
					System.out.println("�ڿ����� KumhoTire�� ��ü");
					car.frontLeftTire = new KumhoTire("�ڿ�����", 17);
					break;
			}
			System.out.println("-----------------");
		}
	}

}