package JAVA2;

public class JAVA7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int k42_i = 1; k42_i < 13; k42_i++) { //���� i�� 12���� �ݺ��Ѵ�.
			System.out.printf(" %d�� =>" ,k42_i); //���� i�� 12���� 1�� ������Ű�鼭 �ݺ� ������ش�. 
			for (int k42_j = 1; k42_j < 32; k42_j++) { //���� j�� 31���� �ݺ� 1�� ������Ű�鼭 ����Ѵ�. 

				System.out.printf("%d," ,k42_j); //����j�� ����Ѵ�.

				if (k42_i == 4 || k42_i == 6 || k42_i == 9 || k42_i == 11) { //���� ���� i�� 4 6 7 9 11�� ���� ��
					if (k42_j == 30) break; //���� ���� j�� 30�� ������ �극��ũ�� ���´�.
				}
				if (k42_i == 2) { //���� ���� i�� 2�� ���� ��
					if (k42_j == 28) break; //���� ����j�� 28�̶�� �극��ũ�� ���´�.
				}
			}
			System.out.printf("\n"); // //for�� �ȿ��� �� ��¸��� ����ó���� �Ѵ�. .
		}
	}
}
