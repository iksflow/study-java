package training.iostream;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExample {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Reader reader = new FileReader("C:/test2.txt");
		int readData;
//		// �� ���� ����(2byte)�� �о�鿩�� int(4byte)Ÿ������ �����Ѵ�.
//		while ((readData=reader.read()) != -1) {
//			char charData = (char) readData;
//			System.out.println(charData);
//		}
		
		/* char �迭�� ����� �迭�� ũ�⸸ŭ �ѹ��� �ҷ��´�.
		 * �Ʒ��� ���̽��� ���ڴ� ���̰� 14�� ���ڿ��� �迭�� ũ�Ⱑ 4�� ���ۿ� ��Ƽ� �ű�Ƿ� ���� 4���� ���� ������ �� �ִ�.
		 * ���̻� ������ ���ڿ��� ���ٸ� -1 �� �����ϹǷ� �������� �������´�.
		 */
		int readCharNo;
		char[] cbuf = new char[4];
		while ((readCharNo=reader.read(cbuf)) != -1) {
			System.out.println(cbuf);
		}
		System.out.println(readCharNo);
	}

}
