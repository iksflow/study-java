package training.exception;

import java.util.Scanner;

public class AccountExample3 {
	/* main �޼ҵ尡 ���ܸ� throw�ϰ� ������ ���������.
	 * ���̻� �󸶸� �������� ����� �ʴ´�.
	 */
	public static void main(String[] args) throws Exception {
		Account account = new Account();
		// �����ϱ�
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("�󸶸� �����Ͻó���?");
			int withdraw = sc.nextInt();
			account.deposit(10000);
			System.out.println("���ݾ�: " + account.getBalance());
			// ����ϱ�
			account.withdraw(withdraw);
		}
	}

}
