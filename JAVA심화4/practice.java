package JAVA4;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class practice {

	 public static String k26_subStrByte(String k26_source, int k26_cutLength) {   // ���ڸ� ���ϴ� ���������� ���, ���ڿ��� ����� �ִ� ���� ���� �Է�
	      if (!k26_source.isEmpty()) {    // ���ڿ��� ������ �ƴ϶�� = ���ڿ��� �����Ѵٸ� �Ʒ��� ����� ����
	         k26_source = k26_source.trim(); // ���ڿ� ó���� ���� ������ ����
	         if (k26_source.getBytes().length <= k26_cutLength) {    // ���ڿ��� ũ�⸦ ����Ʈ�� ȯ���Ͽ� ũ�⸦ ���, �ѱ��� 2����Ʈ �� �� ���ڴ� 1����Ʈ�� ���
	          // ������ �ִ빮�����ũ�Ⱑ �Է¹��� ������ ũ�� �̻��̸�
	            for (int k26_i = k26_cutLength - k26_source.getBytes().length; k26_i > 0; k26_i--) {   // ������ ��ŭ�� ���� �߰�
	               k26_source += " "; 
	           }
	            return k26_source; // ���Ⱑ �߰��� ���ڸ� ��ȯ
	         } else { // �ִ���� ���ں��� �Է¹��� ���ڰ� ũ�ٸ� 
	            StringBuffer k26_sb = new StringBuffer(k26_cutLength);// ���ڸ� �ϳ��� �鿩���� ��ü�� �����ϰ� �ν��Ͻ� ����
	            int k26_cnt = 0;   // �Էµ� ���ڿ��� �и��ϰ� �����ϳ��� ����Ʈ�� ���ϴ� ������ ���� ����
	            for (char k26_ch : k26_source.toCharArray()) { // ���ڿ��� ����Ʈ�� ���� Ȥ�� ���ĺ����� �и��� ��, ���Ҹ� �ϳ��� �����Ѵ�
	               k26_cnt += String.valueOf(k26_ch).getBytes().length; // ������ ����Ʈũ�⸦ ����Ͽ� k26_cnt ���� ������Ų�� 
	               if (k26_cnt > k26_cutLength) { //������Ų k26_cnt�� ���� ������ �ִ빮����� ������ ���� �ѱ�ٸ�
	                  break; // ���� ����Ʈ ������ ������ ����
	               }
	               k26_sb.append(k26_ch); // ���� ���ڸ� �߰��Ͽ� ��ü ������ ��µ� ���ڸ� ������
	            }
	            if (k26_sb.toString().getBytes().length == k26_cutLength-1) { // �ѱ��� 2����Ʈ ¦���̹Ƿ� ������ ����Ʈ ���� Ȧ���� ��� ������ �߻��� �� ����
	               k26_sb.append(" "); // ���� ���� ��� ����Ʈ���� �ϳ� ���� ��� ���� ������ �ϳ� �߰��Ͽ� ������ ����
	            }
	            return k26_sb.toString();// StringBuffer�� ������Ʈ �� k26_sb �� ������ ������ ��ȯ�Ͽ� ���   
	         }
	      } else { 
	         return ""; // ���ڿ��� ������ �� ������ ��ȯ
	      }
	   }
	   
	   public static void k26_line() {   // ���ü��� ���̱� ���� ���� �Լ� ����
	      System.out.println("-----------------------------------------");
	   }

	   
	   public static void main(String[] args) { // �����Ϸ� ����
	      // ��ǰ�� ���� �迭�� ���� �� �ʱ�ȭ
	      String[] k26_itemname = {"�ǻ�"/*, "�ٳ�������","�������ֽ�","������","���ڿ���",
	            "��ī�ݶ�","����ݶ�","Ʈ����","��Ƽ����","��������E",
	            "��� �Ŷ�� 120g*5", "���� ���ִ¿���GT ��Į�θ�", "Ǫ���� �̼��������", "����� ���� ��ũƼ","���ѱ� ������� 156g",
	            "�� ����� �ٳ���(��)","�����","������","����ũ ź�θ� �߰�����","�Ķ󺸳�",
	            "�ɶ�ý� ���� Ʈ����","�Ҵߺ�����","��ȭ��","��«��","���װ���õ��",
	            "�����̾��������ʹ�","����������","�׽�ī�䵹ü������","�Ｚ����ũ120��ġ tv","���̽����� ����û�ұ�"*/};
	      // ��ǰ �ܰ��� ���� �迭�� ���� �� �ʱ�ȭ
	      int[] k26_price = {2, 2500,3000,4000,5000,
	            10000,2800,3200,4700,300,
	            8000,1980,2630,7480,5600,
	            1200,3400,490,800,940,
	            3100,7900,7780,6410,3000,
	            2000,5000,9000,1284000,986740};
	      // ��ǰ ���� ������ ���� �迭�� ���� �� �ʱ�ȭ
	      int[] k26_amount = {1,1,3,4,5,
	            7,8,4,5,6,
	            9,5,1,2,4,
	            6,3,2,2,5,
	            7,4,5,1,2,
	            10,3,6,20,2};
	      // �ش� ��ǰ�� �鼼 ���θ� ������ �迭�� ���� �� �ʱ�ȭ
	      boolean[] k26_taxfree = {false,true,false,false,false,
	         true,true,true,true,true,
	         true,true,true,true,true,
	         true,false,false,false,false,
	         false,false,true,true,true,
	         true,true,true,false,true};
	      
	      // �鼼��ǰ�� �հ� ���� ���� �� �ʱ�ȭ
	      int k26_taxFreeSum = 0;
	      // ������ǰ�� �հ� ���� ���� �� �ʱ�ȭ
	      int k26_taxSum = 0;
	      // �鼼��������ǰ�� �հ� ���� ���� �� �ʱ�ȭ
	      int k26_Sum = 0;
	      
	      // ��������� �ϰ��ǰ� �ϱ����� k26_subStrByte �Լ��� ������ ���� ������ ���� ���� �� �ʱ�ȭ
	      String name = null;
	      
	      // ������ ū ���ڸ� ���ڸ����� ��ǥ ó���ϴ� ��ü ���� �� �ν��Ͻ�����
	      DecimalFormat k26_df = new DecimalFormat("###,###,###,###,###");
	      // ����ð��� ����ϴ� �Լ� ����
	      Date k26_date = new Date(); 
	      // Date�Լ��� ���� ����ð��� ���ڽð� ǥ���� �ٲ��ִ� ��ü ���� �� �ν��Ͻ� ���� 
	      SimpleDateFormat k26_sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	      SimpleDateFormat k26_sdf2 = new SimpleDateFormat("yyyyMMdd");
	      SimpleDateFormat k26_sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // �����ð��� �ð� �Լ�
	      
	      System.out.println("          �̸�Ʈ ������ (031)888-1234"); // �������� ���� ���� ���
	      System.out.println("          206-86-50913 ����"); // �������� ���� ���� ���
	      System.out.println("          ���� ������ ������� 552"); // �������� ���� ���� ���
	      System.out.println("������ �������� ��ȯ/ȯ�� �Ұ�"); // �������� ���� ���� ���
	      System.out.println("�����ǰ�� ����, 30�� �̳�(�ż� 7��)"); // �������� ���� ���� ���
	      System.out.println("���Ϻ� �귣����� ����(���� ����������)"); // �������� ���� ���� ���
	      System.out.println("��ȯ/ȯ�� ���������� ����(����ī�� ����)\n"); // �������� ���� ���� ���
	      System.out.printf("[�� ��]%s     POS:0011-9861\n", k26_sdf.format(k26_date)); // �������� ���� ���� �� ���� �ð��� ���ڽð� �������� ���
	      k26_line();   // ���ü��� ���� ���� ���� 
	      System.out.printf("  %-12s%6s%4s%8s\n", "�� ǰ ��", "�� ��", "����", "�� ��"); // ������ ������ �Ӹ� �κ�
	      
	      for (int k26_i = 0; k26_i < k26_itemname.length; k26_i++) { // ��ε� ��ǰ�� �� ��ŭ �Ʒ��� ����� ����
	         if (k26_i % 5 == 0 ) {   // 5�� �������� �� �������� ������ 
	            k26_line(); // ���� ���� ���
	         }
	         
	         name = k26_subStrByte(k26_itemname[k26_i], 14); // ��ǰ�� ���ѵ� ����� ���� ��ǰ�� �籸�� 14�ڸ����� ���
	         
	         if (k26_taxfree[k26_i]) {   // �鼼 ��ǰ�� ��� �տ� *�� �ٿ��� ���
	            System.out.printf("* %-1s%10s%4d%11s\n", // ��ǰ���� ���������Ͽ�, �ڸ� ���, ��ǰ���� �� �ڸ� ���� ���ѵ� ��°��� ���� ���Ϸ� ����� ��� ���°�����ϰ� ����,  
	                  name, k26_df.format(k26_price[k26_i]), k26_amount[k26_i], k26_df.format(k26_price[k26_i] * k26_amount[k26_i]));
	            k26_taxFreeSum += k26_price[k26_i]* k26_amount[k26_i];
	         } else {   // ���� ��ǰ�̸� *ǥ�þ��� ���
	            System.out.printf("  %-1s%10s%4d%11s\n", // ��ǰ���� ���������Ͽ�, �ڸ� ���, ��ǰ���� �� �ڸ� ���� ���ѵ� ��°��� ���� ���Ϸ� ����� ��� ���°�����ϰ� ����,
	                  name, k26_df.format(k26_price[k26_i]), k26_amount[k26_i], k26_df.format(k26_price[k26_i] * k26_amount[k26_i]));
	            k26_taxSum += k26_price[k26_i]* k26_amount[k26_i];
	         }
	         
	      }
	      
	      int k26_nettax = (int) (k26_taxSum / 1.1); // ���� ����
	      k26_Sum = k26_taxFreeSum + k26_taxSum; // �鼼ǰ�� �հ� + ����ǰ�� �հ� = �����ݾ�
	      
	      System.out.println("");
	      System.out.printf("%22s%14d\n", "�� ǰ�� ����", k26_itemname.length); // ������ ��ǰ�� ��
	      System.out.printf("%23s%14s\n", "(*)�� ��  �� ǰ", k26_df.format(k26_taxFreeSum)); // �鼼ǰ �հ�׿� ���ڸ����� ��ǥ �ٿ���
	      System.out.printf("%23s%14s\n", "�� ��  �� ǰ", k26_df.format(k26_nettax)); // ����ǰ �հ�׿� ���ڸ����� ��ǥ �ٿ���
	      System.out.printf("%24s%14s\n", "��   ��   ��", k26_df.format(k26_taxSum - k26_nettax)); // �ΰ����� ���ڸ����� ��ǥ �ٿ���
	      System.out.printf("%25s%14s\n", "��        ��", k26_df.format(k26_Sum)); // �����ݾ׿� ���ڸ����� ��ǥ �ٿ���
	      System.out.printf("%s %23s\n", "�� �� �� �� �� ��", k26_df.format(k26_Sum)); // �����ݾ׿� ���ڸ����� ��ǥ �ٿ���
	      k26_line(); // �������� ���� ���� ����
	      
	      System.out.println("0012 KEB �ϳ�       541707**0484/35860658"); // ������ ��������
	      System.out.printf("ī�����(IC) %15s%10s\n", "�Ͻú� /", k26_df.format(k26_Sum)); //ī����� �� �����ݾ� ��� 
	      k26_line(); // �������� ���� ���� ����
	      System.out.println("           [�ż�������Ʈ ����]"); // ������ ��������
	      System.out.println("ȫ*�� ������ ����Ʈ ��Ȳ�Դϴ�."); // ������ ��������
	      System.out.printf("��ȸ�߻�����Ʈ %16s%10s\n", "9350**9995", k26_df.format(k26_Sum/1000)); // ������ ��������, ���� �ݾ��� 0.1%�� ����
	      System.out.printf("����(����)����Ʈ %14s (%7s)\n", "5,637", k26_df.format(5473)); // ������ ��������, ��������Ʈ
	      System.out.println("*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�."); // ������ ��������
	      k26_line();// �������� ���� ���� ����
	      System.out.println("    ���űݾױ��� ���������ð� �ڵ��ο�"); // ������ ��������
	      System.out.println("������ȣ :                       34��****"); // ������ ��������
	      System.out.printf("�����ð� :            %s\n", k26_sdf3.format(k26_date)); // ������ �ð��� ���� �ð����� ���
	      k26_line();
	      System.out.println("ĳ��:084599 ��OO                     1150"); // ������ ��������
	      System.out.println("   1l1l1l1l1l1l1l1l1l1ll1l1l1l1l1l1l1"); // ���ڵ� ��ü
	      System.out.printf("     %s/00119861/00164980/31", k26_sdf2.format(k26_date)); // ���ϴ� ���� �ð��� ����ð����� ��� �� ������ ����
	      
	   }

	}