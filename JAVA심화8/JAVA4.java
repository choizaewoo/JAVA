package JAVA8; //�Ÿ����

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JAVA4 {

	public static void main(String[] args) throws IOException {
		//File��ü�� ���� file�� �ҷ��´�.
		File k42_f = new File("C:\\Users\\kopo\\folder\\�������������������.txt");
		//BufferedReader��ü�� ���� fileReader��ü�� �����͸� �о�´�.
		BufferedReader k42_br = new BufferedReader(new FileReader(k42_f));
		//���ڿ��� ������ �����Ѵ�.
		String k42_readtxt;
		String k42_maxPt = ""; 
	    String k42_minPt = ""; 
	    double k42_max = -1;
	    int k42_maxNum = 0;
	    double k42_min = 300;
	    int k42_minNum = 0;
	      
		//readtxt�� ������ ���پ� �ɰ� ������ �����ϰ� �� ���� null�� ����
		if((k42_readtxt = k42_br.readLine()) == null) {
			//�� �����̶�� ����Ѵ�.
			System.out.printf("�� �����Դϴ�.\n");
			//�� ���� ��ȯ�Ѵ�
			return;
		}
		
		//readtxt������ ������ ������ �и��Ͽ� �迭 field_name�� �����Ѵ�.
		String [] k42_field_name = k42_readtxt.split("\t");
		//������ �����ش�.
		double k42_lat = 37.3860521;
		//�浵�� �����ش�.
		double k42_lng = 127.1214038;
		//LineCnt 0���� �ʱ�ȭ 
		int k42_LineCnt = 0;
		//���پ� �о���� ������ readtxt�� �����ϰ� �� ���� nulld�� �ƴ� ����
		while((k42_readtxt = k42_br.readLine())!=null) {
			
			//������ �и��ؼ� �ɰ� ������ field �迭�� �־��ش�.
			String [] field = k42_readtxt.split("\t");
			//0��°�׸���� �����Ѵ�.
			System.out.printf("**[%d��° �׸�]**************\n", k42_LineCnt);
			//field_name ������ �и��� ����� field �迭 10��°�� ����Ѵ�.  //�����ּ�
			System.out.printf(" %s : %s\n", k42_field_name[9], field[9]);
			//field_name ������ �и��� ���� field �迭 13��°�� ����Ѵ�. //������ ����ϴ� ��
			System.out.printf(" %s : %s\n", k42_field_name[13], field[13]);
			//field_name ������ �и��� ���� field �迭 14��°�� ����Ѵ�. //�浵�� ����ϴ� ��
			System.out.printf(" %s : %s\n", k42_field_name[14], field[14]);
			//�Ÿ��� double �Ǽ������� �����Ѵ�. pow�� �������� ��ȯ�ϴ� �Լ��̴�. 
			//Double.parseDouble String Ÿ���� ���ڿ��� double�� (�Ǽ�) �ٲ��ִ� �޼ҵ��̴�.
			//��Ÿ��� ���Ǹ� ���� dist�� ���Ѵ�.
			double dist = Math.sqrt(Math.pow(Double.parseDouble(field[13]) - k42_lat, 2)
					+ Math.pow(Double.parseDouble(field[14]) - k42_lng, 2));
			if (dist > k42_max ) {
				k42_max = dist;
				k42_maxNum = k42_LineCnt;
			} else if ( dist < k42_min) {
				k42_min = dist;
				k42_minNum = k42_LineCnt;
			} 
			System.out.printf(" ���������� �Ÿ� : %fkm \n", dist * 100);
			System.out.printf("************************\n");
		
			
			k42_LineCnt++;
		}
		k42_br.close();
		System.out.printf("�ִ�Ÿ� : %skm\n", k42_max );
		System.out.printf("�ּҰŸ� : %skm\n", k42_min * 100);			
	}

}
