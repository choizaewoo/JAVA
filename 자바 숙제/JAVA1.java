package JAVA8;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JAVA1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try { //try�� ���
			//��ü�� ���� ������ �ҷ��´�.
			File k42_f = new File("C:\\Users\\kopo\\Mytest.txt");
			//��ü ����
			FileWriter k42_fw =new FileWriter(k42_f);
			//write�� �̿��Ͽ� ���Ͽ� ������ �Է����ش�.
			k42_fw.write("�ȳ� ����\n");
			k42_fw.write("hello ���\n");
			//close�� ������ ����Ѵ�.
			k42_fw.close();
			//���� readrer�� ��ü�� �����Ѵ�.
			FileReader k42_fr = new FileReader(k42_f);
			// ���� n�� -1�� �����Ѵ�.
			int k42_n = -1;
			//char �迭�� �����Ѵ�.
			char [] k_42ch;
			//���ǽ��� ����� true��� ���ѹݺ������Ѵ�.
			while(true) {
				//ch �迭�� ũ�⸦ 100���� ������ش�.
				k_42ch = new char[100];
				//�ݺ��Ͽ� 100���� �־��ش�.
				k42_n = k42_fr.read(k_42ch);
				//�ƴ϶�� �극��ũ���� ���ؼ� �������´�.
				if(k42_n == -1) break;
				//�ݺ����� ����ؼ� ����Ѵ�.
				for(int i = 0; i < k42_n; i++) {
					System.out.printf("%c",k_42ch[i]);
				}
			}
			//reading�� close�Ѵ�.
			k42_fr.close();
			//��¹�
			System.out.printf("\n FILE READ END");
			//�� ��츦 ����ٸ� ����ó���� ���ְ� ��¹��� ����Ѵ�.
		}catch(Exception k42_e) {
			System.out.printf("�� ����[%s]\b", k42_e);
		}
	}

}
