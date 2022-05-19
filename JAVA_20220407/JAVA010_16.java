package JAVA_20220407;

import java.io.File;

public class JAVA010_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File("\"C:\\Users\\kopo\\Desktop\\linux");
		File files[] = dir.listFiles();
		
		for (int i = 0; i < files.length; i ++) {
			System.out.println(files[i]);
		}
	}
}
