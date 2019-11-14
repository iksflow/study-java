package training.iostream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		long start = 0;
		long end = 0;
		
		FileInputStream fis1 = new FileInputStream(
				"C:\\Users\\ssi\\Desktop\\pexels-photo-1236701.jpeg"
				);
		start = System.currentTimeMillis();
		while(fis1.read() != -1) {}
		end = System.currentTimeMillis();
		System.out.println("Buffer�� ������� �ʾ��� ��: " + (end - start) + "ms");
		fis1.close();
		FileInputStream fis2 = new FileInputStream(
				"C:\\Users\\ssi\\Desktop\\pexels-photo-1236701.jpeg"
				);
		BufferedInputStream bis = new BufferedInputStream(fis2);	// ���۽�Ʈ�� ����
		System.out.println("Buffer Size Before: " + bis.available());
		start = System.currentTimeMillis();
		while(bis.read() != -1) {}
		end = System.currentTimeMillis();
		System.out.println("Buffer�� ������� ��: " + (end - start) + "ms");
		System.out.println("Buffer Size After: " + bis.available());
		bis.close();
		
		fis2.close();
	}

}
