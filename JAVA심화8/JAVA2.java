package JAVA8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JAVA2 {

	// throws IOException ���ܸ� ������ ��������ִ� ������. //���ܰ� �߻��ϸ� �ش�Ŭ�������� �����.
	//���ܰ� �߻��� �� �ִ� �޼ҵ忡 �����Ѵ�.
	public static void FileWrite() throws IOException{
		File k42_f = new File("C:\\Users\\kopo\\Mytest.txt");
		//bufferedwriter ��ü�� �����ϰ� filewriter��ü�� ���Ͽ� �����͸� writing���� �� �ִ�.
		BufferedWriter k42_bw = new BufferedWriter(new FileWriter(k42_f));
		//���Ͽ� writing ���ش�.
		k42_bw.write("�ȳ�����");
		//newLine�� ���� �ٹٲ��� �����Ѵ�.
		k42_bw.newLine();
		k42_bw.write("hello ���");
		k42_bw.newLine();
		//close�� ���ش�
		k42_bw.close();
	}
	// throws IOException ���ܸ� ������ ��������ִ� ������. //���ܰ� �߻��ϸ� �ش�Ŭ�������� �����.
	//���ܰ� �߻��� �� �ִ� �޼ҵ忡 �����Ѵ�.
	public static void FileRead() throws IOException {
		//��ü�� ������ �ҷ��� �� �ִ�.
		File k_42f = new File("C:\\Users\\kopo\\Mytest.txt");
		//BufferedReader ��ü�� �����ϰ� filereader��ü�� ���ؼ� �����͸� reading�Ѵ�.
		BufferedReader k42_br = new BufferedReader(new FileReader(k_42f));
		//���ڿ� ����
		String k42_readtxt;
		//while���� ���� �ݺ� �����Ѵ�.
		// readLine�� ���� ���� readtxt�� null�� �ƴ� ��
		while((k42_readtxt= k42_br.readLine()) != null) {
			//readtxt�� ����Ѵ�.
			System.out.printf("%s\n", k42_readtxt);
		}
		//close�Ѵ�.
		k42_br.close();
	}
	// throws IOException ���ܸ� ������ ��������ִ� ������. //���ܰ� �߻��ϸ� �ش�Ŭ�������� �����.
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Filewrite Ŭ������ ���Ͽ� ���ڿ��� ���Ͽ� ����Ѵ�.
		FileWrite();
		//FileRead Ŭ������ ���Ͽ� �о�� ������ ���ڿ��� �о��ش�(������ش�).
		FileRead();
	}

}
