package JAVA;

public class JAVA10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k42_MyWon = 1000000; //��ȭ�� 1000000���� ��� int ������ MyWon���� �־��ش�.
		double k42_MoneyEx = 1238.21; //ȯ���� double������ 1238.21�� �־��ش�. 
		double k42_commission = 0.003; //������� double������ 0.003�� �־��ش�.

		int k42_usd = (int) (k42_MyWon / k42_MoneyEx); // ȯ���� �̴޷��� ���Ϸ��� ��ȭ�� ȯ���� �������Ѵ�. �߿��� �� ����ȯ��ek. int�� double������ ����� int������ ����ȯ�� ������Ѵ�.
		int k42_remain = (int) (k42_MyWon - k42_usd * k42_MoneyEx); //�ܵ��� remain������ �����ߴ�. ���������� ����ȯ���ؼ� �־�����Ѵ�. ��
		//�ܵ��� ȯ���� �̴޷��� ȯ���� ���ϰ� ���� ȯ���ߴ� ��ȭ�� ������Ѵ�.

		System.out.printf("**********************************************************\n");//��������
		System.out.printf("			��������� ���				\n");// �������� ���� �� �� ���� \n
		System.out.printf("�� ��ȭȯ���ݾ�: %d��	=>	��ȭ: %d �޷�  	�ܵ�: %d ��", k42_MyWon, k42_usd, k42_remain ); //���� ������ش�..
	}

}
