package JAVA_20220407;

import java.io.FileOutputStream;
import java.io.IOException;

public class JAVA010_13 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream output = new FileOutputStream("C:\\Users\\kopo\\Desktop\\trafficvolume.csv");

		for (int i = 1; i < 15000000; i++) {
			String data = "Line #" + i + "\n";
			output.write(data.getBytes());
		}
		output.close();
	}
  }


