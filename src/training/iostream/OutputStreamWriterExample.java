package training.iostream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("C:/Temp/file.txt");
		Writer writer = new OutputStreamWriter(fos);
		
		String data = "����Ʈ ��� ��Ʈ���� ���� ��� ��Ʈ������ ��ȯ";
		writer.write(data);
		
		writer.flush();
		writer.close();
		System.out.println("���� ������ �������ϴ�.");
		
	}

}
