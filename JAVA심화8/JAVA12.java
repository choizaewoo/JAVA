package JAVA8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class JAVA12 { // 20120126 ������� ��� ����

	public static void main(String[] args) throws IOException {
		// ����ð��� �ҷ��´�. ������� �������� ��µǴ��� �ð��� ��Ȯ�ϰ� ǥ���ϱ� ���ؼ�
		SimpleDateFormat k42_sdt = new SimpleDateFormat(" HH:mm:ss");
		// �ð�Ŭ������� getInstatnce() �ý������� �ҷ�����.
		Calendar k42_c1 = Calendar.getInstance();
		//bufferReader�� ���ؼ� ��ü�� �����ϰ�fileReader�� ������ �����͸� �ܾ�´�.
		File f = new File("C:\\Users\\kopo\\day_data\\StockDailyPrice.csv");
		BufferedReader k42_br = new BufferedReader(new FileReader(f));
		//bufferReader�� ���ؼ� ��ü�� �����ϰ�filewriter�� ������ �����͸� �ܾ�´�.
		File f1 = new File("C:\\Users\\kopo\\day_data\\20120126.csv");
		BufferedWriter k42_bw1 = new BufferedWriter(new FileWriter(f1));
		//������ �����Ѵ�.
		String k42_a = "20120126";
		String k42_readtxt;
		int k42_cnt = 0;
		int k42_wcnt = 0;

		System.out.printf("���α׷� ���� :%s\n", k42_sdt.format(k42_c1.getTime()));
		//�ݺ����� ���ؼ� ���Ͽ� ������ �߰��Ѵ�.
		while ((k42_readtxt = k42_br.readLine()) != null) {
			StringBuffer s = new StringBuffer();
			String[] field = k42_readtxt.split("%_%");
			//���� ���Ͽ� 20120126������ ������ 
			if (k42_readtxt.contains(k42_a)) {
				//readtxt�� �߰��Ѵ�.
				s.append(k42_readtxt);
				//j���� �ʵ��� ���̱��� �ݺ����� �����Ѵ�.
				for (int j = 1; j < field.length; j++) {
					s.append(f1);

				}
				//���ڿ��� ����ȯ��Ų��.
				k42_bw1.write(s.toString());
				//������ �߰��Ѵ�.
				k42_bw1.newLine();
				//�ϳ��� ������Ų��.
				k42_wcnt++;
			}
			k42_cnt++;
		}
		//�ְ��� �ð��� �����Ѵ�.
		SimpleDateFormat sdt2 = new SimpleDateFormat("HH:mm:ss");
		Calendar c2 = Calendar.getInstance();
		k42_br.close();//������
		k42_bw1.close(); //������
		System.out.printf("���α׷� ���� : %s\n ���� �� : %d ����� ���� �� : %d \n", sdt2.format(c2.getTime()), k42_cnt, k42_wcnt);
	}
}
