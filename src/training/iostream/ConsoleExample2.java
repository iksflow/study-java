package training.iostream;

import java.io.Console;

public class ConsoleExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console console = System.console();
		
		System.out.print("���̵� : ");
		String id = console.readLine();
		
		System.out.print("�н�����: ");
		char[] charPass = console.readPassword();
		
		String strPassword = new String(charPass);
		
		System.out.println("------");
		System.out.println(id);
		System.out.println(strPassword);
	}

}
