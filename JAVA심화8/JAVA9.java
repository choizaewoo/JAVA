package JAVA8; //���� �Ⱦ�� �����

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JAVA9 {

	//throws �̿�� Ŭ������ import�� ���־���Ѵ�. mainŬ�������� throws IOException �ۼ�.
	public static void main(String[] args) throws IOException { 
		
		File f = new File("C:\\Users\\kopo\\day_data\\THTSKS010H00.dat");
		BufferedReader br = new BufferedReader(new FileReader(f)); //���۷� �о����
		//�а� bufferedReader�� ������ 
		String readtxt; // ���ڿ� ���� readtxt�� �����Ѵ�.
		int LineCnt = 0; //�ϳ��� �о���δ�.
		int n = - 1; // ���� ����
		StringBuffer s = new StringBuffer(); //StringBuffer�� ���ڿ��� �о���δ�.
		while(true) { //���ǽ��� ����� ����(true) �Ѵٸ� ���ѹݺ����� �����Ѵ�.
			char[] ch = new char[1000];// �Ѱ����о 1000������ �д´�
			
			n = br.read(ch); // �迭�� ����� read�Ѵ�.  1000���� �ƽø��ε� ������ 
			
			if (n == -1) //������ -1���� ������ (n�� -1�̸�) while���� �������´ٴ� ��. 
				break; // n�� -1 �϶� ������ �������´�. 
			
			//char �迭��ŭ �ݺ��Ѵ�.
			//for�� ����� ���
//			for (int i = 0; i < n; i++) {
//				if (ch[i] == '\n') { //����ó�����Ѵٸ� 
//					//toString�޼ҵ��  fileŬ���������� �ǹ̰� �ִ� �޼ҵ��.�ڽ��� ���� �ش� ��ΰ��� �������ش�.
//					System.out.printf("[%s]***\n",s.toString());//��ü s�� ������ �ִ� ���� �Ǵ� ���� ���ڿ��� ����Ѵ�.
//					s.delete(0, s.length()); //0��°���� s.length���� �����Ѵ�. 
//					//
//				}else {
//					s.append(ch[i]);
//				}
//			 }
			for (char c : ch) { //������ ���� ch 1000���� �Ѱ��� character�� ���� �� ����Ѵ�.
				if (c == '\n') { //����ó�����Ѵٸ� 
					//toString�޼ҵ��  fileŬ���������� �ǹ̰� �ִ� �޼ҵ��.�ڽ��� ���� �ش� ��ΰ��� �������ش�.
					System.out.printf("[%s]***\n",s.toString());//��ü s�� ������ �ִ� ���� �Ǵ� ���� ���ڿ��� ����Ѵ�.
					s.delete(0, s.length()); //0��°���� s.length���� �����Ѵ�. 
					//
				}else {
					s.append(c);
				}
			}
			LineCnt++; //�ϳ��� ������Ű�� 1000������ �ݺ����� �����Ѵ�.
		}
		System.out.printf("[%s]***\n",s.toString());//��ü s�� ������ �ִ� ���� �Ǵ� ���� ���ڿ��� ����Ѵ�.
		br.close(); //reading�� ���������� �����ϱ� ���� �� close()�� ���ش�.
	}

}
