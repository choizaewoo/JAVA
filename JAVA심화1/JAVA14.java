package JAVA;

import java.text.DecimalFormat;

public class JAVA14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k42_MyWon = 1000000;//��ȭ�� 1000000���� ��� int ������ MyWon���� �־��ش�.
		double k42_MoneyEx = 1238.21;//ȯ���� double������ 1238.21�� �־��ش�.
		double k42_commission = 0.003;//������� double������ 0.003�� �־��ش�.

		int k42_usd = (int) (k42_MyWon / k42_MoneyEx);// ȯ���� �̴޷��� ���Ϸ��� ��ȭ�� ȯ���� �������Ѵ�. �߿��� �� ����ȯ��ek. int�� double������ ����� int������ ����ȯ�� ������Ѵ�.
		int k42_remain = (int) (k42_MyWon - k42_usd * k42_MoneyEx);//�ܵ��� remain������ �����ߴ�. ���������� ����ȯ���ؼ� �־�����Ѵ�. ��
		//�ܵ��� ȯ���� �̴޷��� ȯ���� ���ϰ� ���� ȯ���ߴ� ��ȭ�� ������Ѵ�.

		double k42_ComPerOne = k42_MoneyEx * k42_commission;// ȯ���� �����Ḧ ���ؼ� �޷��� ������� �־��ش�. double�Ǽ���
		double k42_totalCom = k42_usd * k42_ComPerOne;// ȯ���� �޷��� �޷��� �����Ḧ ���ؼ� �Ѽ������ �־��ش�. double�Ǽ���
		
		int k42_i_totalCom; //�Ѽ����Ḧ int������ �ٽ� �ϳ� �� ������ش�.
		
		k42_usd = (int) (k42_MyWon/(k42_MoneyEx + k42_ComPerOne)); //ȯ���� �޷��� �����Ḧ ���ؼ� ���� ���� ��ȭ�� �����ش�. �װ��� ����ȯ�ؼ� ���� ȯ���� �޷��� �־��ش�.
		k42_totalCom = k42_usd * k42_ComPerOne; //���� ȯ���� �޷��� �޷��� �����Ḧ ���ؼ� �Ѽ������ �־��ش�.
		
		if (k42_totalCom != (double)((int)k42_totalCom)) { //���� �Ǽ��� �Ѽ����ᰡ �Ǽ��� �� �����ᰡ ������...
			k42_i_totalCom = (int)k42_totalCom+1; //�Ѽ����ῡ + 1�� ���ְ� int ���������� ����ȯ�ؼ� i_totalCom�� �־��ش�.
		} else { //�׷���������
			k42_i_totalCom = (int)k42_totalCom; //1�� �������� ���� ���� ���������� ����ȯ�ؼ� �Ѽ����ῡ �־��ش�. 
			
		}
		DecimalFormat k42_df = new DecimalFormat( "###,###,###,###,###"); //DecimalFormatŬ������ �̿��Ѵ�. �ڵ����� import�ؿ´�.
		
		System.out.printf("*****************************************************************\n");
		System.out.printf("			�޸����, ��¥ ����						\n");
		
		System.out.printf("�� ������: %s�� => ��ȭ: %s�޷�, �޷��� ������: %f��\n",
			k42_df.format(k42_i_totalCom), //DecimalFormat������ �����´�.
			k42_df.format(k42_usd), //DecimalFormat������ �����´�.
			k42_ComPerOne); //DecimalFormat������ �����´�.

		
		k42_remain = (int) (k42_MyWon - k42_usd * k42_MoneyEx - k42_i_totalCom);
		System.out.printf("�� ��ȭ ȯ�� �ݾ�: %s�� => ��ȭ: %s�޷� ������¡��: %s�� �ܵ�: %s��\n",
				k42_df.format(k42_MyWon), //DecimalFormat������ �����´�.
				k42_df.format(k42_usd),  //DecimalFormat������ �����´�.
				k42_df.format(k42_i_totalCom),  //DecimalFormat������ �����´�.
				k42_df.format(k42_remain)); //DecimalFormat������ �����´�.
	}
}
