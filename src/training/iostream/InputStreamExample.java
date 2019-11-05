package training.iostream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream is = new FileInputStream("C:/test.png");
		// 1byte�� �о���δ�.
//		int readByte;
//		while ((readByte = is.read()) != -1) {
//			System.out.println("reading..." + readByte);
//			System.out.println("loop");
//		}
		
		// byte�迭�� ũ�� (100) ��ŭ �о���δ�. is.read(readBytes, 0, readBytes.length) �� �����ϴ�.
//		int readByteNo;
//		byte[] readBytes = new byte[100];
//		while ((readByteNo = is.read(readBytes)) != -1) {
//			System.out.println("reading..." + readByteNo);
//		}
		
		// 10��° �ε������� 50���� �о���δ�.
		int readByteNo;
		byte[] readBytes = new byte[100];
		while ((readByteNo = is.read(readBytes, 10, 50)) != -1) {
			System.out.println("reading..." + readByteNo);
		}
		
		// InputStream�� ����� �����ٸ� InputStream���� ����� �ý����ڿ��� Ǯ���ش�.
		is.close();
		
	}

}
