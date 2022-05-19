package JAVA8; //�Ÿ����

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JAVA15 {

	public static void main(String[] args) throws IOException {
		//File��ü�� ���� file�� �ҷ��´�.
		File f = new File("C:\\Users\\kopo\\folder\\�������������������.txt");
		//BufferedReader��ü�� ���� fileReader��ü�� �����͸� �о�´�.
		BufferedReader br = new BufferedReader(new FileReader(f));
		//���ڿ��� ������ �����Ѵ�.
		String readtxt;
		String maxPt = ""; 
	    String minPt = ""; 
	    int max = 0; 
	    int min = 0;
	      
		//readtxt�� ������ ���پ� �ɰ� ������ �����ϰ� �� ���� null�� ����
		if((readtxt = br.readLine()) == null) {
			//�� �����̶�� ����Ѵ�.
			System.out.printf("�� �����Դϴ�.\n");
			//�� ���� ��ȯ�Ѵ�
			return;
		}
		
		//readtxt������ ������ ������ �и��Ͽ� �迭 field_name�� �����Ѵ�.
		String [] field_name = readtxt.split("\t");
		//������ �����ش�.
		double lat = 37.831352;
		//�浵�� �����ش�.
		double lng = 127.509737;
		//LineCnt 0���� �ʱ�ȭ 
		int LineCnt = 0;
		//���پ� �о���� ������ readtxt�� �����ϰ� �� ���� nulld�� �ƴ� ����
		while((readtxt = br.readLine())!=null) {
			
			//������ �и��ؼ� �ɰ� ������ field �迭�� �־��ش�.
			String [] field = readtxt.split("\t");
			//0��°�׸���� �����Ѵ�.
			System.out.printf("**[%d��° �׸�]**************\n", LineCnt);
			//field_name ������ �и��� ����� field �迭 10��°�� ����Ѵ�.  //�����ּ�
			System.out.printf(" %s : %s\n", field_name[9], field[9]);
			//field_name ������ �и��� ���� field �迭 13��°�� ����Ѵ�. //������ ����ϴ� ��
			System.out.printf(" %s : %s\n", field_name[13], field[13]);
			//field_name ������ �и��� ���� field �迭 14��°�� ����Ѵ�. //�浵�� ����ϴ� ��
			System.out.printf(" %s : %s\n", field_name[14], field[14]);
			//�Ÿ��� double �Ǽ������� �����Ѵ�. pow�� �������� ��ȯ�ϴ� �Լ��̴�. 
			//Double.parseDouble String Ÿ���� ���ڿ��� double�� (�Ǽ�) �ٲ��ִ� �޼ҵ��̴�.
			//��Ÿ��� ���Ǹ� ���� dist�� ���Ѵ�.
			double dist = Math.sqrt(Math.pow(Double.parseDouble(field[13]) - lat, 2)
					+ Math.pow(Double.parseDouble(field[14]) - lng, 2));
			System.out.printf(" ���������� �Ÿ� : %f \n", dist * 100);
			System.out.printf("************************\n");
		
			
			LineCnt++;
		}
		br.close();
		br.close();
		System.out.printf("�ִ�Ÿ� : %skm\n", max * 100);
		System.out.printf("�ּҰŸ� : %skm\n", min * 100 );	
	}

}
