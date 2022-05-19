package JAVA8; //�Ÿ����

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JAVA16 {

	public static void main(String[] args) throws IOException {
		// File��ü�� ���� file�� �ҷ��´�.
		File f = new File("C:\\Users\\kopo\\folder\\������������������.csv");
		// BufferedReader��ü�� ���� fileReader��ü�� �����͸� �о�´�.
		BufferedReader br = new BufferedReader(new FileReader(f));
		// ���ڿ��� ������ �����Ѵ�.
		String k42_readtxt;

		String k42_maxPt = "";
		String k42_minPt = "";
		double k42_max = 1;
		int k42_maxNum = 0;
		double k42_min = 0;
		int k42_minNum = 0;

		// readtxt�� ������ ���پ� �ɰ� ������ �����ϰ� �� ���� null�� ����
		if ((k42_readtxt = br.readLine()) == null) {
			// �� �����̶�� ����Ѵ�.
			System.out.printf("�� �����Դϴ�.\n");
			// �� ���� ��ȯ�Ѵ�
			return;
		}

		// readtxt������ ������ ������ �и��Ͽ� �迭 field_name�� �����Ѵ�.
		String[] k42_field_name = k42_readtxt.split(",");
		// ������ �����ش�.
		double k42_lat = 37.3860521;
		// �浵�� �����ش�.
		double k42_lng = 127.1214038;
		// LineCnt 1���� �ʱ�ȭ
		int k42_LineCnt = 1;
		// ���پ� �о���� ������ readtxt�� �����ϰ� �� ���� nulld�� �ƴ� ����
		
		String k42_maxPlace = "";
		String k42_minPlace = "";
		String k42_maxAdd = "";
		String k42_minAdd = "";
		
		
		while ((k42_readtxt = br.readLine()) != null) {

			// ������ �и��ؼ� �ɰ� ������ field �迭�� �־��ش�.
			String[] k42_field = k42_readtxt.split(",");
			// 0��°�׸���� �����Ѵ�.
			System.out.printf("**[%d��° �׸�]**************\n", k42_LineCnt);
			// field_name ������ �и��� ����� field �迭 10��°�� ����Ѵ�. //�����ּ�
			System.out.printf(" %s : %s\n", k42_field_name[1], k42_field[1]);
			System.out.printf(" %s : %s\n", k42_field_name[7], k42_field[7]); //���θ��ּ�
			// field_name ������ �и��� ���� field �迭 13��°�� ����Ѵ�. //������ ����ϴ� ��
			System.out.printf(" %s : %s\n", k42_field_name[3], k42_field[3]);
			// field_name ������ �и��� ���� field �迭 14��°�� ����Ѵ�. //�浵�� ����ϴ� ��
			System.out.printf(" %s : %s\n", k42_field_name[2], k42_field[2]);
			// �Ÿ��� double �Ǽ������� �����Ѵ�. pow�� �������� ��ȯ�ϴ� �Լ��̴�.
			// Double.parseDouble String Ÿ���� ���ڿ��� double�� (�Ǽ�) �ٲ��ִ� �޼ҵ��̴�.
			// ��Ÿ��� ���Ǹ� ���� dist�� ���Ѵ�.

			double dist = Math.sqrt(
					Math.pow(Double.parseDouble(k42_field[3]) - k42_lat, 2) + Math.pow(Double.parseDouble(k42_field[2]) - k42_lng, 2));

			System.out.printf(" ���������� �Ÿ� : %fkm \n", dist * 100);
			System.out.printf("************************\n");
			if (k42_LineCnt == 1) {
				k42_max = dist;
				k42_min = dist;
				k42_maxNum = k42_LineCnt;
				k42_minNum = k42_LineCnt;

			} else {
				if (dist > k42_max) {
					k42_max = dist;
					k42_maxNum = k42_LineCnt;
					k42_maxPlace = k42_field[1];
					k42_maxAdd = k42_field[7];
					
					
				}
				if (dist < k42_min) {
					k42_min = dist;
					k42_minNum = k42_LineCnt;
					k42_minPlace = k42_field[1];
					k42_minAdd = k42_field[7];

				}
			}
			k42_LineCnt++;
		}

		br.close();
		System.out.printf("���θ��ּ� %s\n ��� : %s\n �ִ�Ÿ� : %skm\n", k42_maxAdd, k42_maxPlace, k42_max * 100);
		
		System.out.printf("���θ��ּ� : %s\n ��� : %s\n �ּҰŸ� : %skm\n", k42_minAdd, k42_minPlace, k42_min * 100);
	}
}





