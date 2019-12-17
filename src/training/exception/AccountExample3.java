package training.exception;

import java.util.Scanner;

public class AccountExample3 {
	/* main 메소드가 예외를 throw하고 실행을 멈춰버린다.
	 * 더이상 얼마를 인출할지 물어보지 않는다.
	 */
	public static void main(String[] args) throws Exception {
		Account account = new Account();
		// 예금하기
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("얼마를 인출하시나요?");
			int withdraw = sc.nextInt();
			account.deposit(10000);
			System.out.println("예금액: " + account.getBalance());
			// 출금하기
			account.withdraw(withdraw);
		}
	}

}
