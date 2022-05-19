package JAVA_20220407;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class JAVA010_10 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		byte[] content = new byte[1000000];
		
		try {
			FileInputStream input = new FileInputStream("C:\\Users\\kopo\\Desktop\\trafficvolume.csv");
		} catch {
			
			
		}
		
				
			
		input.read(content);
		String allLine = new String(content);
		System.out.println(allLine);
		input.close();
		
		
	}
}
