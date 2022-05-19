package JAVA_20220407;

import java.io.FileWriter;
import java.io.IOException;

public class JAVA010_14 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("C:\\Users\\kopo\\Desktop\\out.txt", false);
		for(int i = 11; i < 16; i++) {
			String data = "Line #" + i + "\n";
			fw.write(data);
		}
		fw.close();
	}
}
