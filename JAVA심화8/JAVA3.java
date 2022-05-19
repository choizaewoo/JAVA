package JAVA8; //���� ���Ͽ� ����

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JAVA3 {
	// throws IOException ���ܸ� ������ ��������ִ� ������. //���ܰ� �߻��ϸ� �ش�Ŭ�������� �����.
	public static void main(String[] args) throws IOException {
		//��ü�� �������ش�. csv File�� �ҷ��´�.
		File k42_f = new File("C:\\Users\\kopo\\folder\\�����������������⵵.csv");
		//BufferedReader ��ü�� �����ϰ� filereader ��ü�� ���ؼ� �����͸� reading�Ѵ�.
		BufferedReader k42_br = new BufferedReader(new FileReader(k42_f));
		//���ڿ� readtxt������ �����Ѵ�.
		String K42_readtxt;
		//���ڿ� readtxt�� ������ ������ �о���� ������ readtxt�� ����ǰ� �� ������ null�� ��
		if ((K42_readtxt = k42_br.readLine()) == null) {
			//�������Դϴٸ� ����Ѵ�.
			System.out.printf("�� �����Դϴ�\n");
			return; //������ ���� �� ��ȯ
		}
		//���ڿ� filed_name �迭�� �����ϰ� readtxt�� ,�� �ɰ��� ������ field_name �迭�� �������ش�.
		String[] k42_field_name = K42_readtxt.split(",");
		int k42_LineCnt = 0;
		//������ ���پ� ���� ������ readtxt�� ����ǰ� �� ������ null�� �ƴ� �� 
		while ((K42_readtxt = k42_br.readLine()) != null) {
			//readtxt�� ����� ������ ,��ŭ �ɰ���.
			String[] field = K42_readtxt.split(",");
			//0��° �׸��� ����Ѵ�.
			System.out.printf("**[%d��° �׸�]***********\n", k42_LineCnt);
			//for���� ���� ���� j�� 0���� field_name.length���� �ݺ������Ѵ�.
			for (int j = 0; j < k42_field_name.length; j++) {//�ݺ����� �� ������ �ϳ��� ������Ű�鼭 �����Ѵ�.
				//�ɰ��� field_name �迭�� field �迭�� ����Ѵ�.
				System.out.printf(" %s : %s\n", k42_field_name[j], field[j]);
			}
			System.out.printf("*********************************\n");
			//LinCnt�� 100�̶�� �극��ũ���� ���ؼ� ������ Cnt�� �߰��Ѵ�.
			if (k42_LineCnt == 100)
				break;
			k42_LineCnt++;
		}
		//������.
		k42_br.close();
	}

}
