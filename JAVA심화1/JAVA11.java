package JAVA;

public class JAVA11 {

	public static void main(String[] arsg) {
		// TODO Auto-generated method stub
		int k42_MyWon = 1000000;//��ȭ�� 1000000���� ��� int ������ MyWon���� �־��ش�.
		
		double k42_MoneyEx = 1238.21;//ȯ���� double������ 1238.21�� �־��ش�.
		double k42_commission = 0.003;//������� double������ 0.003�� �־��ش�.
		
		int k42_usd = (int) (k42_MyWon / k42_MoneyEx);// ȯ���� �̴޷��� ���Ϸ��� ��ȭ�� ȯ���� �������Ѵ�. �߿��� �� ����ȯ��ek. int�� double������ ����� int������ ����ȯ�� ������Ѵ�.

		double k42_ComPerOne = k42_MoneyEx * k42_commission; // ȯ���� �����Ḧ ���ؼ� �޷��� ������� �־��ش�.
		double K42_totalCom = k42_usd * k42_ComPerOne; // ȯ���� �޷��� �޷��� �����Ḧ ���ؼ� �Ѽ������ �־��ش�.
		
		System.out.printf("*****************************************************************\n");//��������
		System.out.printf("*			    ������ ���				*\n"); //��������
		System.out.printf("�� ������: %f��	=>��ȭ: %d�޷�  	�޷��� ������: %f��", K42_totalCom, k42_usd, k42_ComPerOne);//���� �־��ش�. f�� �Ǽ����ڷ��̴�. double���� �� ���� �Ǽ��� ��Ÿ���ش�.<->float
		
	}
}
