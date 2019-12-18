package training.exception;

import java.util.Scanner;

public class AccountExample2 {
	/* try catch���� ���� ����ó���� �ؼ� 
	 * ���ܰ� �߻��ϴºκ��� �޼ҵ忡�� ���ܸ� ó���ϵ��� �������.
	 * main �޼ҵ��� ������ �������ʴ´�.
	 */
	public static void main(String[] args) {
		Account account = new Account();
		// �����ϱ�
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("�󸶸� �����Ͻó���?");
			int withdraw = sc.nextInt();
			account.deposit(10000);
			System.out.println("���ݾ�: " + account.getBalance());
			// ����ϱ�
			try {
				account.withdraw(withdraw);
			} catch (BalanceInsufficientException e) {
				String message = e.getMessage();
				System.out.println(message);
				System.out.println();
				e.printStackTrace();
			}
		}
	}

}
