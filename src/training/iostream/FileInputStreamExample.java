package training.iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileInputStreamExample {

	public static void main(String[] args) {
		try {
			// TODO Auto-generated method stub
			
//			FileOutputStream fos = new FileOutputStream("C:/test2.txt");
//			fos.write("abcde".getBytes());
//			fos.close();
			FileInputStream fis = new FileInputStream("C:/test2.txt");
			int data;
			char[] buffs = new char[10];
			while((data = fis.read()) != -1) {
				System.out.print((char)data);
				
				System.out.write(data);
			}
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
