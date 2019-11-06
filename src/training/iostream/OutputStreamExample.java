package training.iostream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int count = 0;
		OutputStream os = new FileOutputStream("C:/test2.txt");
		byte[] data = "ABCD".getBytes();
		
		// 1byte씩 출력스트림으로 보낸다.
//		for (int i = 0; i < data.length; i++) {
//			os.write(data[i]);
//			count++;
//		}
//		System.out.println("loop count : " + count);
		
		// byte배열에 저장된 모든 바이트를 내보낸다.
//		os.write(data);
		
		// AB만 출력함.
		os.write(data, 0, 2);
		
	}

}
