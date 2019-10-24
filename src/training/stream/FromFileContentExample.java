package training.stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileContentExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path path = Paths.get("samples/text/sample.txt");
		Stream<String> stream;
		
		// Files.lines() �޼ҵ� �̿�
		stream = Files.lines(path, Charset.defaultCharset());
		stream.forEach( System.out :: println );
		System.out.println();
		
		// BufferedReader�� lines() �޼ҵ� �̿�
		File file = path.toFile();
		FileReader fileReader = new FileReader(file);
		BufferedReader br = new BufferedReader(fileReader);
		stream = br.lines();
		stream.forEach(System.out :: println);
	}

}
