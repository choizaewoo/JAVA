package JAVA8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JAVA2 {

	// throws IOException 예외를 강제로 실행시켜주는 선언문임. //예외가 발생하면 해당클래스에서 벗어난다.
	//예외가 발생할 수 있는 메소드에 선언한다.
	public static void FileWrite() throws IOException{
		File k42_f = new File("C:\\Users\\kopo\\Mytest.txt");
		//bufferedwriter 객체를 생성하고 filewriter객체를 통하여 데이터를 writing해줄 수 있다.
		BufferedWriter k42_bw = new BufferedWriter(new FileWriter(k42_f));
		//파일에 writing 해준다.
		k42_bw.write("안녕파일");
		//newLine을 통해 줄바꿈을 수행한다.
		k42_bw.newLine();
		k42_bw.write("hello 헬로");
		k42_bw.newLine();
		//close를 해준다
		k42_bw.close();
	}
	// throws IOException 예외를 강제로 실행시켜주는 선언문임. //예외가 발생하면 해당클래스에서 벗어난다.
	//예외가 발생할 수 있는 메소드에 선언한다.
	public static void FileRead() throws IOException {
		//객체로 파일을 불러올 수 있다.
		File k_42f = new File("C:\\Users\\kopo\\Mytest.txt");
		//BufferedReader 객체를 생성하고 filereader객체를 통해서 데이터를 reading한다.
		BufferedReader k42_br = new BufferedReader(new FileReader(k_42f));
		//문자열 선언
		String k42_readtxt;
		//while문을 통해 반복 수행한다.
		// readLine을 통해 읽은 readtxt가 null이 아닐 때
		while((k42_readtxt= k42_br.readLine()) != null) {
			//readtxt를 출력한다.
			System.out.printf("%s\n", k42_readtxt);
		}
		//close한다.
		k42_br.close();
	}
	// throws IOException 예외를 강제로 실행시켜주는 선언문임. //예외가 발생하면 해당클래스에서 벗어난다.
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Filewrite 클래스를 통하여 문자열을 파일에 출력한다.
		FileWrite();
		//FileRead 클래스를 통하여 읽어온 파일의 문자열을 읽어준다(출력해준다).
		FileRead();
	}

}
