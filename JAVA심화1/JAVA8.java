package JAVA;

public class JAVA8 {
	
	public static int k42_netprice(int price, double rate) { //Ŭ������ �������� ������ ����ϰ� ���̱� ���ؼ���.
		return (int)(price/(1+rate)); //���߿� ������ �����̴�. ���⼭ ��� �� ����ٰ� ������. 1234�� 1.1�� ������ 1121.81818�� ���´� . ���������� ����ȯ�ϸ� 1121.
		//�� 1121�� netprice�� �ȴ�.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k42_price = 1234; //price�� ���������� 1234�� �־��ش�.
		double k42_rate = 0.1; //rate�� �Ǽ������� 0.1�� �־��ش�.
		
		int k42_netprice = k42_netprice(k42_price,k42_rate); //������ Ŭ������ price�� rate�� ���� ����� Ŭ������ ���ϰ����� ���ش�. ���������� ���ִ� ���̴�.
		// �� 1121.
		int k42_tax = k42_price - k42_netprice;
		// ������ = �Һ��ڰ��ݿ��� netprice�� ���ش�. 113�̴�.
		System.out.printf("***************************************\n");
		System.out.printf("*       �Һ��ڰ�, ��������, ���� ���         *\n");
		System.out.printf(" �Һ��ڰ���: %d ���� ����: %d ����: %d\n", k42_price, k42_netprice, k42_tax);//�Һ��ڰ��� ������ ���ݼ����� ��µȴ�.
		System.out.printf("***************************************\n");
	
	}
}
