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
		
		// 1byte�� ��½�Ʈ������ ������.
//		for (int i = 0; i < data.length; i++) {
//			os.write(data[i]);
//			count++;
//		}
//		System.out.println("loop count : " + count);
		
		// byte�迭�� ����� ��� ����Ʈ�� ��������.
//		os.write(data);
		
		// AB�� �����.
		os.write(data, 0, 2);
		
	}

}
