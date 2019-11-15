package training.iostream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BufferedOutputStreamExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int data = -1;
		long start = 0;
		long end = 0;
		
		
		fis = new FileInputStream(
				"C:\\Users\\ssi\\Desktop\\pexels-photo-1236701.jpeg"
				);
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("C:/Temp/test-img.jpeg");
		start = System.currentTimeMillis();
		while((data = bis.read()) != -1) {
			fos.write(data);
		}
		end = System.currentTimeMillis();
		System.out.println("Buffered 사용하지 않았을 때: " + (end - start) + "ms");
		
		fis = new FileInputStream(
				"C:\\Users\\ssi\\Desktop\\pexels-photo-1236701.jpeg"
				);
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("C:/Temp/test-img.jpeg");
		bos = new BufferedOutputStream(fos);
		start = System.currentTimeMillis();
		while((data = bis.read()) != -1) {
			bos.write(data);
		}
		end = System.currentTimeMillis();
		bos.flush();
		bos.close();
		fos.close();
		bis.close();
		fis.close();
		System.out.println("Buffered 사용했을 때: " + (end - start) + "ms");		
	}

}
