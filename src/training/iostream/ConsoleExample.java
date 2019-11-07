package training.iostream;

import java.io.IOException;
import java.io.InputStream;

public class ConsoleExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream is = System.in;
		char inputChar = (char)is.read();
		System.out.println(inputChar);
	}

}
