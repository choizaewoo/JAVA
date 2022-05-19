package JAVA4;

import java.text.DecimalFormat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Scanner;

public class JAVA4 {
	public static String k42_subStrByte(String k42_source, int k42_cutLength) {
		//isEmpty�� ��ü�� ���������� �� ��ü�� ������� �� true�� ��ȯ���ش�.
		//������ ��� ���鵵 ��ü�ȿ� ������ �����Ѵٰ� �Ǵ��Ͽ� false�� ����Ѵ�.
		if (!k42_source.isEmpty()) { //���ڿ��� ����ִٸ�
			k42_source = k42_source.trim(); //trim�� �̿��Ͽ� ���ڿ� �յ��� ������ �����Ѵ�.
			//����Ʈ�� ���̸� �����ش�.
			//�⺻���ڵ��� UTF-8�� �Ǿ����� ��� �ѱ��� �ѱ��ڴ� 3����Ʈ�� ���ȴ�.
			//�ѱ��ڴ� 2����Ʈ�� ��µǰ� �ϵ��� ���ڵ��� �����Ѵ�.
			if (k42_source.getBytes().length < k42_cutLength) {
				//�ڸ� ����Ʈ ������ ���ڿ��� ���̸�ŭ ���ش�.
				for (int k42_i = k42_cutLength - k42_source.getBytes().length; k42_i > 0; k42_i--) {
					//������ �߰����ش�.
					k42_source += " ";
				}
				//����ó���� ���ڿ��� ��ȯ���ش�.
				return k42_source;
			} else { //�׷���������
				//StringBuffer �ڷ����� append�޼ҵ带 ����Ѵ�.
				//���ڸ� �ϳ��� �鿩���� StringBuffer ��ü�� �����ϰ� �ν��Ͻ� ����
				StringBuffer k42_sb = new StringBuffer(k42_cutLength);
				//�Էµ� ���ڿ��� �и��ϰ� �����ϳ��� ����Ʈ�� ���ϴ� ������ ���� ����
				int k42_cnt = 0;
				//���ڿ��� ����Ʈ�� ���ĺ��̳� �ѱ�(����)�� �ɰ��� �ϳ��� �����Ѵ�.
				for (char k42_ch : k42_source.toCharArray()) {
					//���� ����Ʈũ�⸦ ����ؼ� �ϳ��� �߰����ش�.
					k42_cnt += String.valueOf(k42_ch).getBytes().length;
					//������Ų cnt�� ������ �ִ빮����� ������ ũ�ٸ�
					if (k42_cnt > k42_cutLength)
						//�극��ũ������ ������
						break;
					//���� ���ڸ� �߰��Ͽ� ��ü ������ ��µ� ���ڸ� ������
					k42_sb.append(k42_ch);
				}
				//�ѱ��� 2����Ʈ ¦���̹Ƿ� ������ ����Ʈ ���� Ȧ���� ��� ������ �߻��� �� ����
				//���� ���� ��� ����Ʈ���� �ϳ� ���� ��� ���� ������ �ϳ� �߰��Ͽ� ������ ����
				if (k42_sb.toString().getBytes().length == k42_cutLength - 1) {
					//������ �߰��Ѵ�.
					k42_sb.append(" ");
				}
				// ��ü ������ ������ ��ȯ�ؼ� ��ȯ
				return k42_sb.toString();
			}
		} else {
			return ""; // ���ڿ��� ������ ���� ���� ��ȯ
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat k42_df = new DecimalFormat( "###,###"); //DecimalFormatŬ������ �̿��Ѵ�. �ڵ����� import�ؿ´�.
		//scanner�� ����Ѵ�.
		//������ ������ iprice�� �����ϰ� nextInt()������ �޾��ش�. ���������� �޾��ش�.
		int k42_iPrice = 30000;
		//���� iprice�� 10���� �����ְ� �ΰ����� �����Ѵ�.
		int k42_iTax = k42_iPrice / 10;
		// �Ѱ����� ���ݰ� �ΰ����� ������ ������ �����Ѵ�.
		int iSum = k42_iPrice + k42_iTax;
		//������ ��°��� �����ش�.
		System.out.printf("�ſ����\n");
		//������ ��°��� �����ش�. 
		System.out.printf("�ܸ��� : 2N68665898          ��ǥ��ȣ : 041218\n");
		//������  ��°��� �����ش�.
		System.out.printf("������ : �Ѿ��ġ�\n");
		//������ ��°��� �����ش�.
		System.out.printf("%s","�ּ� : ��� ");
		System.out.printf("%s","������ �д籸 ");
		System.out.printf("%s\n", "Ȳ�����351���� 10 .");
		System.out.printf("%s\n", "1��");
		System.out.printf("��ǥ�� : ��â��\n");
		System.out.printf("����� : 752-53-00558            TEL : 7055695\n");
		//����ó���� �Ѵ�.
		System.out.printf("---------------------------------------------\n");
		//����ó���� �Ѵ�.
		System.out.printf("---------------------------------------------\n");
		System.out.printf("%s %39s��\n", "�ݾ�",k42_df.format(k42_iPrice));
		//���޾��� decimal�� �����Ͽ� �޸��� ����ش�.
		System.out.printf("%s %36s��\n", "�ΰ��� ",k42_df.format(k42_iTax));
		//�ΰ����� decimal�� �����Ͽ� �޸��� ����ش�.
		System.out.printf("%s %39s��\n", "�հ�",k42_df.format(iSum));
		//�ѱݾ��� decimal�� �����Ͽ� �޸��� ����ش�.
		System.out.printf("---------------------------------------------\n");
		//����ó���� �Ѵ�.��
		System.out.printf("�츮ī��\n");
		//������ ��°��� �����ش�.
		System.out.printf("ī���ȣ : 5387-20**-****-4613(S)      �Ͻú�\n");
		//������ ��°��� �����ش�.
		Calendar calt = Calendar.getInstance();
		//calendarŬ������ ����ð��� �ҷ����ش�.
		SimpleDateFormat sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		System.out.printf("�ŷ��Ͻ� : %s\n", sdt.format(calt.getTime()));
		//������ ��°��� �����ش�.
		System.out.printf("���ι�ȣ : 70404427\n");
		System.out.printf("�ŷ���ȣ : 357734873793\n");
		System.out.printf("���� : ��ī���        ���� : 720068568\n");
		System.out.printf("�˸� : EDC����ǥ\n");
		System.out.printf("���� : TEL)1544-4700\n");
		System.out.printf("---------------------------------------------\n");
		System.out.printf("		  *�����մϴ�*				\n");
		System.out.printf("		            ǥ��V2.08_20200212");
	}

}
