
package JAVA8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class stockdata {

	public static void main(String[] args) throws IOException {
		// pg10 ��������
		// ������ ��ġ�� ������ File f�� �����ϴ�.
		File k37_f = new File("C:\\Users\\kopo\\day_data\\THTSKS010H00.dat");
		// BufferedReader �� br�� �����Ѵ�. FileReader- �б�(������ ����) �� ���Ͽ�
		BufferedReader k37_br = new BufferedReader(new FileReader(k37_f));
		// �ش� ��ġ�� ������ ���ϸ����� �����Ѵ�.
		// BufferedReader �� br�� �����Ѵ�. FileReader- �ۼ�(������ ����) �� ���Ͽ�
		File k37_f1 = new File("C:\\Users\\kopo\\day_data\\StockDailyPrice.csv");
		// BufferedWriter�� bw1�� ���� FileWriter - �ۼ� (������ ����) �� ���Ͽ�
		BufferedWriter k37_bw1 = new BufferedWriter (new FileWriter(k37_f1));
			
		String k37_readtxt;	//���ڿ� ���� ����
		// cnt �� wcnt ����
		int k37_cnt = 0; int k37_wcnt = 0;
		// ���۽ð��� �����ϱ� ���� currentTimeMillis ����
		long k37_startTime = System.currentTimeMillis();
		// ���� ������� while�� Ż�⼱��		
		while((k37_readtxt =k37_br.readLine()) != null) {
			// StringBuffer�� s �� �����Ѵ�.
			StringBuffer k37_s = new StringBuffer();
			// readtxt�� %_%�� �������� �߶� ���ڿ� �迭�� �ִ´�.
			String[] k37_field = k37_readtxt.split("%_%");
			// �� �ʵ忡�� ^�� ������ ����, trim(�յ� ��������), substring���� 1��° ���ڸ� ����, A�� ������
			if(k37_field.length > 2 && k37_field[2].replace("^", "").trim().substring(0, 1).equals("A")) {
				k37_s.append(k37_field[0].replace("^","").trim());	//s�� field�� ù��° ���ڿ�, ^�� �����ϰ� �յ� ������ �߶� �߰��ض�
				for (int j = 1; j < k37_field.length; j++) {	// 1���� field�� ���̸�ŭ ���� for�� �ۼ�
					k37_s.append("," + k37_field[j].replace("^", "").trim());	//s��  , + ^�� ���� ���ڿ��� �߰��ض� (�յ� ���鵵 ����)
				}
				k37_bw1.write(k37_s.toString()); k37_bw1.newLine();	//bw1�� s�� ���ڿ��� �ۼ��ϰ� �ٹٲ��� �����ض�
				k37_wcnt++;	// ���� ���� +1
 			}
			k37_cnt++; // �� ���� ���� +1
		}
		
		long k37_finishTime = System.currentTimeMillis();	//������ �ð� ���
        long k37_elapsedTime = k37_finishTime - k37_startTime;	//������ �ð��� ó���ð��� ���̷� ������ �ð��� ����Ѵ�.
        // �ð��� ���� �׸�� ��� ����
        System.out.println("startTime(ms) : " + k37_startTime);
        System.out.println("finishTime(ms) : " + k37_finishTime);
        System.out.println("elapsedTime(�ɸ��½ð�) : " + (k37_elapsedTime) / 60000 + "��" + (int)(k37_elapsedTime / 1000) % 60 + "��");
        System.out.println("�� �׸� ���� : " + k37_cnt);
        System.out.println("�����ڵ� A�� �����ϴ� �׸� ���� : " + k37_wcnt);
		// BufferedReader, BufferedWriter ���� ����
		k37_br.close();
		k37_bw1.close();
		
//		System.out.printf("Program End[%d][%d]records\n", cnt, wcnt);

	}
}
