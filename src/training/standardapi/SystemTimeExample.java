package training.standardapi;

public class SystemTimeExample {

	public static void main(String[] args) {
		long time1 = System.nanoTime();
		
		int sum = 0;
		for (int i = 1; i <= 100000; i++) {
			sum += i;
		}
		
		long time2 = System.nanoTime();
		
		System.out.println("1 ~ 100000 ������ ��: " + sum);
		System.out.println("��꿡 " + (time2 - time1) + " �����ʰ� �ҿ�Ǿ����ϴ�.");
		
		long time3 = System.currentTimeMillis();
		
		int sum2 = 0;
		for (int i = 1; i <= 100000; i++) {
			sum2 += i;
		}
		
		long time4 = System.currentTimeMillis();
		
		System.out.println("1 ~ 100000 ������ ��: " + sum2);
		System.out.println("��꿡 " + (time4 - time3) + " �и��ʰ� �ҿ�Ǿ����ϴ�.");
	}

}
