package JAVA4;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class JAVA5 {

	// ����ð� ���ϴ� �Լ�. ���ǿ� ���� ����ϴ� ������ �ٲ�.
		public static String getPresentTime(int order) {
			// ���� �ð��� �ޱ����� ���� ��ü ����.
			Calendar k42_cal = Calendar.getInstance();
			// �Ʒ� ���ǹ��� ���� ���� �ð��� ���ڿ��� �����Ѵ�.
			String k42_getTime = "";	
			if(order == 1) {	
				// ���� �ð� ����ϴ� ����� �����ش�.
				SimpleDateFormat k42_time = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");	
				k42_getTime = k42_time.format(k42_cal.getTime());	//���� �ð��� �� ���ڿ��� �����Ѵ�.
			} else if(order == 2) {// �Ű����� ���� 1�� �ƴ� ��� 14���� ���ϰ� "MM/dd" �������� �ð��� �������ش�. 
				k42_cal.add(Calendar.DATE, 14);	// ���� �ð��� 14���� �����ִ� ��.
				SimpleDateFormat k42_time = new SimpleDateFormat("MM��dd��");	// ������ "MM/dd"�� �����ش�.
				k42_getTime = k42_time.format(k42_cal.getTime());	//���� �ð��� �� ���ڿ��� �����Ѵ�.( ��¥�� ������ 14�� ������)
			} 
			return k42_getTime;	//���ǿ� ���� ���� ���ڿ��� ��������.
		}

		// �ѱ� �ڸ��� ���� �߰��ϴ� �Լ�
		public static String subStrByte(String k42_source, int k42_cutLength) { // �Ű������� �ڸ� �����, �ڸ��� ���� �޴´�.
			if (!k42_source.isEmpty()) {	// ���ڿ��� �ƹ��͵� ���� �ʴٸ� �Ʒ� ������� �����Ѵ�.
				k42_source = k42_source.trim();// ���忡 �ִ� ���� ����
				if (k42_source.getBytes().length < k42_cutLength) { //�ڸ��� ������ ���̰� ª�ٸ�, �Ʒ� ������ �����Ѵ�.
					for (int k42_i = k42_cutLength - k42_source.getBytes().length; k42_i > 0; k42_i--) {
						k42_source += " ";	//���ڸ� ��ŭ ������ �߰����ش�.
					}
					return k42_source;	//���ڿ��� �ٽ� �����Ѵ�.
				} else {	// �ڸ��� ������ ���̰� ª�� �ʴٸ� �Ʒ� ������� �����Ѵ�.
					StringBuffer k42_sb = new StringBuffer(k42_cutLength);	// ���ڿ��� �߰��ϰų� �ڸ��� ��ü ����.
					int k42_num = 0;	// ���� �񱳸� ���� ���� ����.
					for (char k41_ch : k42_source.toCharArray()) {	// ���ڿ��� ���ڷ� ��ȯ.
						k42_num += String.valueOf(k41_ch).getBytes().length;	//�ش� ������ ����Ʈ ���̸� k41_num�� �־���.
						if (k42_num > k42_cutLength)	// �Ű������� ���� ���̺��� ũ�ٸ� �ݺ��� ���.
							break;
						k42_sb.append(k41_ch);	//���ڿ� ���� ���ڸ� �߰��Ѵ�.
					}
					if (k42_sb.toString().getBytes().length == k42_cutLength-1) { 
						//���ڿ��� �ѱ� ũ�� ������ �����ؼ� ��ĭ �����Ҷ�, �Ʒ� ������ �����Ѵ�.
						k42_sb.append(" ");	// ������ �߰��Ѵ�.
					}

					return k42_sb.toString();	//������ ���ڿ��� �������ش�.
				}
			} else {	// ���ڿ��� �ƹ��͵� ���ٸ� �Ʒ� ������ �����Ѵ�.
				return "";	//�״�� �����ش�.
			}
		}
	public static void main(String[] args) {
		String k42_itemName1 = "����óġ ��Ʈ";
		String k42_itemCode1 = "1031235";
		int k42_iPrice1 = 12000;
		int k42_amount1 = 1;
		String k42_itemName2 = "�����̵�ĸ���(������) (100ȣ)";
		String k42_itemCode2 = "11008152";
		int k42_iPrice2 = 1800;
		int k42_amount2 = 1;
		String k42_itemName3 = "�������� ���׸��� ��ũ(�˷�̴�Ÿ��)";
		String k42_itemCode3 = "1020800";
		int k42_iPrice3 = 12000;
		int k42_amount3 = 1;
		int k42_totalTax = 0; int k42_totalPrice = 0; int k41_supPrice = 0;
		// �ΰ��� �հ�, �ܰ� �հ�, �����հ踦 ���� ������ �����ϰ� �ʱ�ȭ ���ش�.
		// �ΰ��� ���
		k42_totalPrice = (k42_iPrice1*k42_amount1)+(k42_iPrice2*k42_amount2)+(k42_iPrice3*k42_amount3); // �ܰ� �հ踦 �����ش�.
		k42_totalTax = k42_totalPrice/ 11;	//�� �ΰ����� �����ش�.
		double k41_tax_check = k42_totalPrice/ 11.0;	// ���������ε� �� �ΰ����� ���Ѵ�.
		if (k42_totalTax == k41_tax_check) {
		} else {	// �������� �������� ���� �ٸ��ٸ� �ΰ����� 1�� �����ش�.
			k42_totalTax = k42_totalTax + 1;
		}
		k41_supPrice = k42_totalPrice - k42_totalTax;	// �� �հ迡�� �ΰ��� ���� ���� �����հ踦 ���Ѵ�.
		// �޸����
		DecimalFormat k42_df = new DecimalFormat("###,###,###,###,###");
		// �ؽ�Ʈ

		System.out.printf("%25s\n", "\"���ΰ���, ���̼�\"");
		System.out.println("(��)�Ƽ����̼�_�д缭����");
		System.out.printf("��ȭ:031-702-6016\n");
		System.out.println("����:���� ������ ���μ�ȯ�� 2748 (���)");
		System.out.println("��ǥ:������,��ȣ�� 213-81-52063");
		System.out.println("����:��⵵ ������ �д籸 �д��53���� 11 (����");
		System.out.println("��)");
		System.out.println("================================================");
		System.out.printf("%27s\n", "�Һ����߽ɰ濵(CCM) �������");
		System.out.printf("%29s\n", "ISO 9001 ǰ���濵�ý��� �������");
		System.out.println("================================================");
		System.out.printf("          ��ȯ/ȯ�� 14��(%s)�̳�,\n", getPresentTime(2));
		//�Ű������� 2�� �־� ����ð��� 14���� ���� ��¥�� ����Ѵ�.
		System.out.printf("(����)������, ����ī�� ���� �� ���Ը��忡�� ����\n");
		System.out.printf("       ����/���� �� �Ѽս� ��ȯ/ȯ�� �Ұ�\n");
		System.out.printf("         üũī�� ��� �� �ִ� 7�� �ҿ�\n");
		System.out.println("================================================");
		System.out.printf("[%s] %34s\n", "POS 1058231", getPresentTime(1)); //�Ű������� 1�� �־� ���� �ð��� ����Ѵ�.
		System.out.println("================================================");
		System.out.printf("%s %8s %2d %9s\n", subStrByte(k42_itemName1, 26), k42_df.format(k42_iPrice1), k42_amount1,
				k42_df.format(k42_iPrice1 * k42_amount1)); // ���ڸ� ���� �ִ� 26���� �ڸ���, �ܰ�, ���� , ���� �ݾ��� ����Ѵ�.
		System.out.printf("[%s]\n", k42_itemCode1);
		System.out.printf("%s %8s %2d %9s\n", subStrByte(k42_itemName2, 26), k42_df.format(k42_iPrice2), k42_amount2,
				k42_df.format(k42_iPrice2 * k42_amount2)); // ���ڸ� ���� �ִ� 26���� �ڸ���, �ܰ�, ���� , ���� �ݾ��� ����Ѵ�.
		System.out.printf("[%s]\n", k42_itemCode2);
		System.out.printf("%s %8s %2d %9s\n", subStrByte(k42_itemName3, 26), k42_df.format(k42_iPrice3), k42_amount3,
				k42_df.format(k42_iPrice3 * k42_amount3)); // ���ڸ� ���� �ִ� 26���� �ڸ���, �ܰ�, ���� , ���� �ݾ��� ����Ѵ�.
		System.out.printf("[%s]\n", k42_itemCode3);
		System.out.printf("              �����հ�%26s\n", k42_df.format(k41_supPrice)); //ǰ�� 3���� ���ް��� �� ���ļ� ����Ѵ�.
		System.out.printf("                �ΰ���%26s\n", k42_df.format(k42_totalTax));	//�ΰ����� �� ���ļ� ����Ѵ�.
		System.out.println("------------------------------------------------");
		System.out.printf("�Ǹ��հ�%40s\n", k42_df.format(k42_totalPrice)); 
		System.out.println("================================================");
		System.out.printf("�ſ�ī��%40s\n", k42_df.format(k42_totalPrice));
		System.out.println("------------------------------------------------");
		System.out.printf("�츮ī��                        538720**********\n");
		System.out.printf("���ι�ȣ %s%17s %3s\n", "77982843(0)", "���αݾ�",
				k42_df.format(k42_totalPrice));
		System.out.println("================================================");
		System.out.printf("%28s %s\n", getPresentTime(1), "�д缭����");	//�Ű������� 1�� �־� ���� �ð��� ����Ѵ�.
		System.out.printf("��ǰ �� ��Ÿ���� : 1522-4400\n");
		System.out.printf("����� �� �����̼� ���� ���� : 1599-2211\n");
		System.out.printf("%32s\n", "2112820610158231");
		System.out.println("------------------------------------------------");
		System.out.printf("  �� ���̼� ����� �� �Ǵ� Ȩ�������� �����ϼż�\n");
		System.out.printf("    ȸ������ �� �پ��� ������ ����������! ��");

	}

}