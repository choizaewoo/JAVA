package JAVA;

public class JAVA5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k42_val = 14/5; // �� ���� 2.8�̴�. int�̱� ������ �Ҽ��� ���ϸ� ������ 2�̴�. 
		//�ݿø��ϸ� 3�̴�
		System.out.printf("#5-1 : %d\n", k42_val);
		
		double k42_valF; //�Ҽ����� ������ִ� double �Ǽ����� ���´�.
		//������ ����ȯ�� �ϸ� �ݿø�ó���� �ȴ�.
		//�Ǽ��� ���� �𸣸����� ������..
		
		k42_valF = 14/5; // 14 �� 5 �� ������ ������ ������ �̰� �Ҽ��� �ڸ��� ����� �ȵȴ�.
		System.out.printf("#5-2 : %f\n", k42_valF); //2.000000
		
		k42_valF = 14.0/5; // �Ѱ��� �Ǽ������� ǥ�ø� ���־�� double���� ���´�.
		System.out.printf("#5-3 : %f\n", k42_valF); //2.800000
		
		k42_valF = (14.0)/5 + 0.5; //�Ǽ����� 0.5�� ���غ���. 
		System.out.printf("#5-4 : %f\n", k42_valF); //3.300000
		
		k42_val = (int)((14.0)/5 + 0.5); //�Ǽ�������� �ϰ� ���������� �� ��ȯ�� �Ѵ�.
		System.out.printf("#5-5 : %d\n", k42_val); // 3
	}

}
