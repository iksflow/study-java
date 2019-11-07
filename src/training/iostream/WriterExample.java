package training.iostream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Writer writer = new FileWriter("C:/test2.txt");
		char[] data = "ABC".toCharArray();
		
		for(int i = 0; i < data.length; i++) {
			writer.write(data[i]);
		}
		
	}

}
