package JAVA8;  

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class JAVA11 { //�Ｚ���ڸ� ���

	public static void main(String[] args) throws IOException {
		//����ð��� �ҷ��´�. ������� �������� ��µǴ��� �ð��� ��Ȯ�ϰ� ǥ���ϱ� ���ؼ�
		SimpleDateFormat sdt = new SimpleDateFormat(" HH:mm:ss");
		//�ð�Ŭ������� getInstatnce() �ý������� �ҷ�����.
	      Calendar c1 = Calendar.getInstance();


		//�ֽĵ����͸� �б� ���� bufferReader ��ü�� ���� fileReader�� ������ �Ǵ� ������ �ҷ��´�.
		File f = new File("C:\\Users\\kopo\\day_data\\StockDailyPrice.csv"); 
		BufferedReader br = new BufferedReader(new FileReader(f));
		//�ֽĵ����͸� ���� ���� bufferReader ��ü�� ���� fileReader�� ������ �Ǵ� ������ �ҷ��´�
		File f1 = new File("C:\\Users\\kopo\\day_data\\A005390.csv");
		BufferedWriter bw1 = new BufferedWriter(new FileWriter(f1));
		//�ҷ��� ���ڿ��� �����Ѵ�.
		String a = "A005930";
		//���ڿ��� readtxt�� �����Ѵ�.
		String readtxt;
		int cnt = 0; 
		int wcnt = 0;
		
        System.out.printf("���α׷� ���� :%s\n", sdt.format(c1.getTime()));
       
 
		
		//�ݺ����� �̿��ؼ� ������ ���پ� �����´�.
		while((readtxt = br.readLine())!=null) {
			//stringbuffer ��ü����
		StringBuffer s = new StringBuffer();		
					//a������ �����ϸ� ����Ѵ�. �߰��Ѵ�.
			if(readtxt.contains(a)) {
				s.append(readtxt);	
				//���ڿ��� ��ȯ�ϰ� ������ �߰��Ѵ�.
				bw1.write(s.toString()); bw1.newLine();
				wcnt++;		
			}
			cnt++;
		}
			//
			SimpleDateFormat sdt2 = new SimpleDateFormat("HH:mm:ss");
			Calendar c2 = Calendar.getInstance();
	        System.out.printf("���α׷� ���� : %s ���� �� : %d ����� ���� �� : %d \n", sdt2.format(c2.getTime()), cnt, wcnt);
	        br.close();
			bw1.close();
		}
	}

