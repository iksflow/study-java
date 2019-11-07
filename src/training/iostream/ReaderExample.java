package training.iostream;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExample {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Reader reader = new FileReader("C:/test2.txt");
		int readData;
//		// 한 개의 문자(2byte)씩 읽어들여서 int(4byte)타입으로 리턴한다.
//		while ((readData=reader.read()) != -1) {
//			char charData = (char) readData;
//			System.out.println(charData);
//		}
		
		/* char 배열을 만들어 배열의 크기만큼 한번에 불러온다.
		 * 아래의 케이스는 문자는 길이가 14인 문자열을 배열의 크기가 4인 버퍼에 담아서 옮기므로 루프 4번에 전부 가져올 수 있다.
		 * 더이상 가져올 문자열이 없다면 -1 을 리턴하므로 루프에서 빠져나온다.
		 */
		int readCharNo;
		char[] cbuf = new char[4];
		while ((readCharNo=reader.read(cbuf)) != -1) {
			System.out.println(cbuf);
		}
		System.out.println(readCharNo);
	}

}
