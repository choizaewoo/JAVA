package JAVA_20220407;

import java.io.File;

public class JAVA010_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\kopo\\Desktop\\out.txt");
		System.out.println(file.exists());
		if (file.exists()) {
			file.delete();
		}
		System.out.println(file.exists());
	}

}
