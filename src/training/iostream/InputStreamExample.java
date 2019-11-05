package training.iostream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream is = new FileInputStream("C:/test.png");
		// 1byte씩 읽어들인다.
//		int readByte;
//		while ((readByte = is.read()) != -1) {
//			System.out.println("reading..." + readByte);
//			System.out.println("loop");
//		}
		
		// byte배열의 크기 (100) 만큼 읽어들인다. is.read(readBytes, 0, readBytes.length) 와 동일하다.
//		int readByteNo;
//		byte[] readBytes = new byte[100];
//		while ((readByteNo = is.read(readBytes)) != -1) {
//			System.out.println("reading..." + readByteNo);
//		}
		
		// 10번째 인덱스부터 50개씩 읽어들인다.
		int readByteNo;
		byte[] readBytes = new byte[100];
		while ((readByteNo = is.read(readBytes, 10, 50)) != -1) {
			System.out.println("reading..." + readByteNo);
		}
		
		// InputStream의 사용이 끝났다면 InputStream에서 사용한 시스템자원을 풀어준다.
		is.close();
		
	}

}
